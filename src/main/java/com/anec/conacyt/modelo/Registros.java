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
@Table(name = "registros")
public class Registros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_parcela")
    private int idParcela;
    @Basic(optional = false)
    @Column(name = "etapa")
    private int etapa;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "actividad")
    private String actividad;
    @Basic(optional = false)
    @Column(name = "categoria")
    private int categoria;
    @Basic(optional = false)
    @Column(name = "arvenses")
    private boolean arvenses;
    @Basic(optional = false)
    @Column(name = "practica")
    private int practica;
    @Basic(optional = false)
    @Column(name = "unidad")
    private int unidad;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "precio")
    private int precio;
    @Column(name = "incidencias")
    private String incidencias;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "muestreo")
    private Boolean muestreo;

    public Registros() {
    }

    public Registros(Integer id) {
        this.id = id;
    }

    public Registros(Integer id, int idParcela, int etapa, Date fecha, String actividad, int categoria, boolean arvenses, int practica, int unidad, int cantidad, int precio) {
        this.id = id;
        this.idParcela = idParcela;
        this.etapa = etapa;
        this.fecha = fecha;
        this.actividad = actividad;
        this.categoria = categoria;
        this.arvenses = arvenses;
        this.practica = practica;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }

    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public boolean getArvenses() {
        return arvenses;
    }

    public void setArvenses(boolean arvenses) {
        this.arvenses = arvenses;
    }

    public int getPractica() {
        return practica;
    }

    public void setPractica(int practica) {
        this.practica = practica;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getMuestreo() {
        return muestreo;
    }

    public void setMuestreo(Boolean muestreo) {
        this.muestreo = muestreo;
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
        if (!(object instanceof Registros)) {
            return false;
        }
        Registros other = (Registros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.anec.conacyt.modelo.Registros[ id=" + id + " ]";
    }
    
}
