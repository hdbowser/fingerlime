/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerlime.models;

import java.util.ArrayList;
import java.util.List;
import fingerlime.core.FormatoCampo;

/**
 *
 * @author victor
 */
public class ReporteCyG {

    private int id;
    private String codigo;
    private int idContribuyente;
    private String rnc;
    private String periodo;
    private int cantidadRegistros;
    
    /**/
    private String NombreContribuyente;

    List<RegistroReporteCyG> registros;
    
    public ReporteCyG(){
        registros = new ArrayList<>();
        this.NombreContribuyente = "Contribuyente Generico";
        
    }

    public boolean cargarDesdeArregloTxt(List<String> _arreglo) {
        String strCabecera = _arreglo.get(0);
        String[] cabecera = strCabecera.split("\\|");

        if (cabecera.length == 4) {
            this.setCodigo(cabecera[0]);
            this.setRnc(cabecera[1]);
            this.setPeriodo(cabecera[2]);
            this.setCantidadRegistros(cabecera[3]);
        }

        for (int i = 1; i < _arreglo.size(); i++) {
            String[] registro = _arreglo.get(i).split("\\|");
            if(registro.length == 23){
                RegistroReporteCyG item = new RegistroReporteCyG();
                item.setNumRegistro(i);
                item.setRncProveedor(registro[0]);
                item.setTipoId(Integer.parseInt(registro[1]));
                item.setIdTipoBienesYServiciosComprados(Integer.parseInt(registro[2]));
                item.setNfc(registro[3]);
                item.setNfcModificado(registro[4]);
                item.setFechaComprobante(registro[5]);
                item.setFechaPago(registro[6]);
                item.setMontoFacturadoServicios(FormatoCampo.monto(registro[7]));
                item.setMontoFacturadoBienes(FormatoCampo.monto(registro[8]));
                item.setTotalMontoFacturado(FormatoCampo.monto(registro[9]));
                item.setItbisFacturado(FormatoCampo.monto(registro[10]));
                item.setItbisRetenido(FormatoCampo.monto(registro[11]));
                item.setItbisSujAProporcionalidad(FormatoCampo.monto(registro[12]));
                item.setItbisLlevadoAlCosto(FormatoCampo.monto(registro[13]));
                item.setItbisPorAdelantar(FormatoCampo.monto(registro[14]));
                item.setItbisPercibidoCompras(FormatoCampo.monto(registro[15]));
                item.setIdTipoRetIsr(FormatoCampo.id(registro[16]));
                item.setMontoRetencionRenta(FormatoCampo.monto(registro[17]));
                item.setIsrPercibidoCompras(FormatoCampo.monto(registro[18]));
                item.setImpSelectConsumo(FormatoCampo.monto(registro[19]));
                item.setOtrosImpuestos(FormatoCampo.monto(registro[20]));
                item.setMontoPropinaLegal(FormatoCampo.monto(registro[21]));
                item.setIdFormaPago(Integer.parseInt(registro[22]));
                
                this.registros.add(item);
            }
            
        }
        return false;
    }

    /*[ SETTERS ]*/
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setIdContribuyente(int idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setCantidadRegistros(String cantidadRegistros) {
        this.cantidadRegistros = Integer.parseInt(cantidadRegistros);
    }

    /*[ GETTERS ]*/
    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getIdContribuyente() {
        return idContribuyente;
    }

    public String getRnc() {
        return rnc;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getCantidadRegistros() {
        return cantidadRegistros;
    }

    public List<RegistroReporteCyG> getRegistros() {
        return registros;
    }

    public String getNombreContribuyente() {
        return NombreContribuyente;
    }
    

}
