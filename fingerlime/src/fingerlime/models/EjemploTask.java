/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerlime.models;

import fingerlime.core.FormatoTxtContribuyente;
import fingerlime.gui.ajustes.FrmAjustes;
import java.io.File;
import java.util.List;

/**
 *
 * @author victor
 */
public class EjemploTask implements Runnable {

    public EjemploTask(FrmAjustes form) {
        this.form = form;
    }
    private FrmAjustes form;

    @Override
    public void run() {
        try {
            if (form.archivoContribuyentes != null) {
                FormatoTxtContribuyente fTxt = new FormatoTxtContribuyente(form.archivoContribuyentes);
                List<ContribuyenteRaw> contribuyentes = fTxt.obtenerRegistros();
                for (int i = 0; i < 1000; i++) {
                    System.out.println(contribuyentes.get(i).getRnc());
                }
            }

        } catch (UnsupportedOperationException ex) {

        }finally{
            form.getpbgImportacionDatos().setIndeterminate(false);
        }
    }

}
