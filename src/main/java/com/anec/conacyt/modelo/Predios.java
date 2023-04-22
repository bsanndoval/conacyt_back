/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anec.conacyt.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bsandoval
 */
@Entity
@Table(name = "predios")
public class Predios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic(optional = false)
    @Column(name = "productor")
    private String productor;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "predio")
    private String predio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "superficie")
    private Float superficie;
    @Column(name = "longitud")
    private Float longitud;
    @Column(name = "latitud")
    private Float latitud;
    @Column(name = "altitud")
    private Float altitud;
    @Column(name = "accuracy")
    private Float accuracy;
    @Column(name = "pendiente")
    private String pendiente;
    @Column(name = "fecha_siembra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSiembra;
    @Column(name = "fecha_cosecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCosecha;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "ciclo")
    private String ciclo;
    @Column(name = "cultivo")
    private String cultivo;
    @Column(name = "semilla")
    private Integer semilla;
    @Column(name = "variedad")
    private String variedad;
    @Column(name = "densidad_siembra")
    private String densidadSiembra;
    @Column(name = "rendimiento")
    private Float rendimiento;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "calidad")
    private Integer calidad;

    public Predios() {
    }

    public Predios(Integer id) {
        this.id = id;
    }

    public Predios(Integer id, int idUsuario, String productor, int estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.productor = productor;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public Float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getAltitud() {
        return altitud;
    }

    public void setAltitud(Float altitud) {
        this.altitud = altitud;
    }

    public Float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Float accuracy) {
        this.accuracy = accuracy;
    }

    public String getPendiente() {
        return pendiente;
    }

    public void setPendiente(String pendiente) {
        this.pendiente = pendiente;
    }

    public Date getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(Date fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public Date getFechaCosecha() {
        return fechaCosecha;
    }

    public void setFechaCosecha(Date fechaCosecha) {
        this.fechaCosecha = fechaCosecha;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }

    public Integer getSemilla() {
        return semilla;
    }

    public void setSemilla(Integer semilla) {
        this.semilla = semilla;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getDensidadSiembra() {
        return densidadSiembra;
    }

    public void setDensidadSiembra(String densidadSiembra) {
        this.densidadSiembra = densidadSiembra;
    }

    public Float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCalidad() {
        return calidad;
    }

    public void setCalidad(Integer calidad) {
        this.calidad = calidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Predios)) {
            return false;
        }
        Predios other = (Predios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.anec.conacyt.modelo.Predios[ id=" + id + " ]";
    }
    
}
