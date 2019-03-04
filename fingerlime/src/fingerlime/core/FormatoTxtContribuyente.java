/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerlime.core;

import java.io.File;
import fingerlime.models.ContribuyenteRaw;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import fingerlime.models.Contribuyente;

/**
 *
 * @author victor
 */
public class FormatoTxtContribuyente {

    public FormatoTxtContribuyente(File _archivo) {
        this.archivo = _archivo;
    }
    private final int CANTIDAD_PROPIEDADES = 11;
    File archivo;

    private List<String> obtenerFilas() {
        List<String> filas = new ArrayList<>();
        if (this.archivo != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(this.archivo));
                String linea = "";
                while ((linea = reader.readLine()) != null) {
                    filas.add(linea);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return filas;
    }

    public List<ContribuyenteRaw> obtenerRegistros() {
        List<String> registros = this.obtenerFilas();
        List<ContribuyenteRaw> contribuyentes = new ArrayList<>();

        for (String linea : registros) {
            String[] item = linea.split("\\|");
            if (item.length == this.CANTIDAD_PROPIEDADES) {
                ContribuyenteRaw cont = new ContribuyenteRaw();
                cont.setRnc(item[0]);
                cont.setNombre(item[1]);
                cont.setNombreComercial(item[2]);
                cont.setActividadEconomica(item[3]);
                cont.setCalle(item[4]);
                cont.setNumeroCasa(item[5]);
                cont.setCiudad(item[6]);
                cont.setTelefono(item[7]);
                cont.setFechaRegistro(item[8]);
                cont.setEstado(item[9]);
                cont.setRegimenPago(item[10]);

                contribuyentes.add(cont);
            }
        }
        return contribuyentes;
    }

}
