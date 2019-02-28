/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerlime.models;

/**
 *
 * @author victor
 */
public class Item606 {

    private int idRemisionConstGast;
    private int numRegistro;
    private String rncProveedor;
    private int tipoId;
    private int idTipoBienesYServiciosComprados;
    private String nfc;
    private String nfcModificado;
    private String fechaComprobante;
    private String fechaPago;
    private double montoFacturadoServicios;
    private double montoFacturadoBienes;
    private double totalMontoFacturado;
    private double itbisFacturado;
    private double itbisRetenido;
    private double itbisSujAProporcionalidad;
    private double itbisLlevadoAlCosto;
    private double itbisPorAdelantar;
    private double itbisPercibidoCompras;
    private int idTipoRetIsr;
    private double montoRetencionRenta;
    private double isrPercibidoCompras;
    private double impSelectConsumo;
    private double otrosImpuestos;
    private double montoPropinaLegal;
    private int idFormaPago;
    
    /**/
    private String nombreProveedor;
    
    public Item606(){
        this.nombreProveedor = "Proveedor Generico";
    }
    
    /*[ SETTERS ]*/
    public void setIdRemisionConstGast(int idRemisionConstGast) {
        this.idRemisionConstGast = idRemisionConstGast;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public void setRncProveedor(String rncProveedor) {
        this.rncProveedor = rncProveedor;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public void setIdTipoBienesYServiciosComprados(int idTipoBienesYServiciosComprados) {
        this.idTipoBienesYServiciosComprados = idTipoBienesYServiciosComprados;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public void setNfcModificado(String nfcModificado) {
        this.nfcModificado = nfcModificado;
    }

    public void setFechaComprobante(String fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setMontoFacturadoServicios(double montoFacturadoServicios) {
        this.montoFacturadoServicios = montoFacturadoServicios;
    }

    public void setMontoFacturadoBienes(double montoFacturadoBienes) {
        this.montoFacturadoBienes = montoFacturadoBienes;
    }

    public void setTotalMontoFacturado(double totalMontoFacturado) {
        this.totalMontoFacturado = totalMontoFacturado;
    }

    public void setItbisFacturado(double itbisFacturado) {
        this.itbisFacturado = itbisFacturado;
    }

    public void setItbisRetenido(double itbisRetenido) {
        this.itbisRetenido = itbisRetenido;
    }

    public void setItbisSujAProporcionalidad(double itbisSujAProporcionalidad) {
        this.itbisSujAProporcionalidad = itbisSujAProporcionalidad;
    }

    public void setItbisLlevadoAlCosto(double itbisLlevadoAlCosto) {
        this.itbisLlevadoAlCosto = itbisLlevadoAlCosto;
    }

    public void setItbisPorAdelantar(double itbisPorAdelantar) {
        this.itbisPorAdelantar = itbisPorAdelantar;
    }

    public void setItbisPercibidoCompras(double itbisPercibidoCompras) {
        this.itbisPercibidoCompras = itbisPercibidoCompras;
    }

    public void setIdTipoRetIsr(int idTipoRetIsr) {
        this.idTipoRetIsr = idTipoRetIsr;
    }

    public void setMontoRetencionRenta(double montoRetencionRenta) {
        this.montoRetencionRenta = montoRetencionRenta;
    }

    public void setIsrPercibidoCompras(double isrPercibidoCompras) {
        this.isrPercibidoCompras = isrPercibidoCompras;
    }

    public void setImpSelectConsumo(double impSelectConsumo) {
        this.impSelectConsumo = impSelectConsumo;
    }

    public void setOtrosImpuestos(double otrosImpuestos) {
        this.otrosImpuestos = otrosImpuestos;
    }

    public void setMontoPropinaLegal(double montoPropinaLegal) {
        this.montoPropinaLegal = montoPropinaLegal;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }
    
    /*[ GETTERS ]*/

    public int getIdRemisionConstGast() {
        return idRemisionConstGast;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public String getRncProveedor() {
        return rncProveedor;
    }

    public int getTipoId() {
        return tipoId;
    }

    public int getIdTipoBienesYServiciosComprados() {
        return idTipoBienesYServiciosComprados;
    }

    public String getNfc() {
        return nfc;
    }

    public String getNfcModificado() {
        return nfcModificado;
    }

    public String getFechaComprobante() {
        return fechaComprobante;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public double getMontoFacturadoServicios() {
        return montoFacturadoServicios;
    }

    public double getMontoFacturadoBienes() {
        return montoFacturadoBienes;
    }

    public double getTotalMontoFacturado() {
        return totalMontoFacturado;
    }

    public double getItbisFacturado() {
        return itbisFacturado;
    }

    public double getItbisRetenido() {
        return itbisRetenido;
    }

    public double getItbisSujAProporcionalidad() {
        return itbisSujAProporcionalidad;
    }

    public double getItbisLlevadoAlCosto() {
        return itbisLlevadoAlCosto;
    }

    public double getItbisPorAdelantar() {
        return itbisPorAdelantar;
    }

    public double getItbisPercibidoCompras() {
        return itbisPercibidoCompras;
    }

    public int getIdTipoRetIsr() {
        return idTipoRetIsr;
    }

    public double getMontoRetencionRenta() {
        return montoRetencionRenta;
    }

    public double getIsrPercibidoCompras() {
        return isrPercibidoCompras;
    }

    public double getImpSelectConsumo() {
        return impSelectConsumo;
    }

    public double getOtrosImpuestos() {
        return otrosImpuestos;
    }

    public double getMontoPropinaLegal() {
        return montoPropinaLegal;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }
    
}
