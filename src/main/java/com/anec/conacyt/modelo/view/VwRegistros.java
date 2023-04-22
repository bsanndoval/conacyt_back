/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anec.conacyt.modelo.view;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bsandoval
 */
@Entity
@Table(name = "vw_registros")

public class VwRegistros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_parcela")
    private Integer idParcela;
    @Column(name = "etapa")
    private Integer etapa;
    @Column(name = "etapaf")
    private String etapaf;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "actividad")
    private Integer actividad;
    @Column(name = "categoria")
    private Integer categoria;
    @Column(name = "categoriaf")
    private String categoriaf;
    @Column(name = "arvenses")
    private Boolean arvenses;
    @Column(name = "practica")
    private Integer practica;
    @Column(name = "practicaf")
    private String practicaf;
    @Column(name = "unidad")
    private Integer unidad;
    @Column(name = "unidadf")
    private String unidadf;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "incidencias")
    private String incidencias;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "muestreo")
    private Boolean muestreo;

    public VwRegistros() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(Integer idParcela) {
        this.idParcela = idParcela;
    }

    public Integer getEtapa() {
        return etapa;
    }

    public void setEtapa(Integer etapa) {
        this.etapa = etapa;
    }

    public String getEtapaf() {
        return etapaf;
    }

    public void setEtapaf(String etapaf) {
        this.etapaf = etapaf;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getActividad() {
        return actividad;
    }

    public void setActividad(Integer actividad) {
        this.actividad = actividad;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getCategoriaf() {
        return categoriaf;
    }

    public void setCategoriaf(String categoriaf) {
        this.categoriaf = categoriaf;
    }

    public Boolean getArvenses() {
        return arvenses;
    }

    public void setArvenses(Boolean arvenses) {
        this.arvenses = arvenses;
    }

    public Integer getPractica() {
        return practica;
    }

    public void setPractica(Integer practica) {
        this.practica = practica;
    }

    public String getPracticaf() {
        return practicaf;
    }

    public void setPracticaf(String practicaf) {
        this.practicaf = practicaf;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public String getUnidadf() {
        return unidadf;
    }

    public void setUnidadf(String unidadf) {
        this.unidadf = unidadf;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
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
    
}
