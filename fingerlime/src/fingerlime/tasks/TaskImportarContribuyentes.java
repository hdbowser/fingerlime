/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerlime.tasks;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import fingerlime.core.DataManager;
import fingerlime.core.FormatoTxtContribuyente;
import fingerlime.gui.ajustes.FrmAjustes;
import fingerlime.models.ContribuyenteRaw;
import java.text.MessageFormat;
import java.util.Formatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class TaskImportarContribuyentes extends DataManager implements Runnable {

    public TaskImportarContribuyentes(FrmAjustes form) {
        this.form = form;
    }
    private FrmAjustes form;

    @Override
    public void run() {
        String sql = this.obtenerQuery().toString();
        if (this.guardarRegistros(sql)) {
            JOptionPane.showMessageDialog(form, "OK");
        } else {
            JOptionPane.showMessageDialog(form, "Error");
        };
        form.getpbgImportacionDatos().setIndeterminate(false);
        form.getpbgImportacionDatos().setString("");

    }

    private StringBuilder obtenerQuery() {
        StringBuilder sb = new StringBuilder();
        try {
            if (form.archivoContribuyentes != null) {
                FormatoTxtContribuyente fTxt = new FormatoTxtContribuyente(form.archivoContribuyentes);
                List<ContribuyenteRaw> contribuyentes = fTxt.obtenerRegistros();

                sb.append("INSERT INTO dgii_contribuyentes("
                        + "rnc,"
                        + "nombre,"
                        + "nombreComercial,"
                        + "actividadEconomica,"
                        + "calle,"
                        + "numero,"
                        + "ciudad,"
                        + "telefono,"
                        + "fechaRegistro,"
                        + "estado,"
                        + "regimenPago)"
                        + " VALUES");
                String comma = "";
                for (int i = 0; i < 100000; i++) {
                    comma = (i == (100000 - 1)) ? ";" : ",";
                    sb.append(MessageFormat.format("(''{0}'',''{1}'',''{2}'',''{3}'',''{4}'',''{5}'',''{6}'',''{7}'',''{8}'',''{9}'',''{10}''){11}\n",
                            contribuyentes.get(i).getRnc(),
                            contribuyentes.get(i).getNombre(),
                            contribuyentes.get(i).getNombreComercial(),
                            contribuyentes.get(i).getActividadEconomica(),
                            contribuyentes.get(i).getCalle(),
                            contribuyentes.get(i).getNumeroCasa(),
                            contribuyentes.get(i).getCiudad(),
                            contribuyentes.get(i).getTelefono(),
                            contribuyentes.get(i).getFechaRegistro(),
                            contribuyentes.get(i).getEstado(),
                            contribuyentes.get(i).getRegimenPago(),
                            comma
                    ));
                }
            }

        } catch (UnsupportedOperationException ex) {

        }
        return sb;
    }

    private boolean guardarRegistros(String sql) {
        boolean r = false;
        Connection cnn = this.getConnection();
        try {
            
            PreparedStatement pstm = cnn.prepareStatement(sql);
            if (pstm.executeUpdate() > 0) {
                r = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                cnn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                form.getpbgImportacionDatos().setIndeterminate(false);
                form.getpbgImportacionDatos().setString("");
            }
        }

        return r;
    }
}
