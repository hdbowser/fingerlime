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
public class ContribuyenteRaw {
    private String rnc;
    private String nombre;
    private String nombreComercial;
    private String actividadEconomica;
    private String categoria;
    private String telefono;
    private String estado;
    private String calle;
    private String numeroCasa;
    private String ciudad;
    private String fechaRegistro;
    private String regimenPago;

    /*[ SETTERS ]*/
    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setRegimenPago(String regimenPago) {
        this.regimenPago = regimenPago;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    /*[ GETTERS ]*/

    public String getRnc() {
        return rnc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getRegimenPago() {
        return regimenPago;
    }

    public String getEstado() {
        return estado;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    
    
}
