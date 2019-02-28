/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerlime.core;

/**
 *
 * @author victor
 */
public class FormatoCampo {

    public static double monto(String valor) {
        double r = 0D;
        valor = (!valor.equals("")) ? valor : "0";
        try {
            r = Double.parseDouble(valor);
        } catch (java.lang.NumberFormatException ex) {
            System.out.println(ex.getMessage());
            r = 0D;
        }
        return r;
    }

    public static int id(String valor) {
        int r = 0;
        valor = (!valor.equals("")) ? valor : "0";
        try {
            r = Integer.parseInt(valor);
        } catch (java.lang.NumberFormatException ex) {
            System.out.println(ex.getMessage());
            r = 0;
        }
        return r;
    }
}
