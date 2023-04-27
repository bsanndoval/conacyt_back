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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bsandoval
 */
@Entity
@Table(name = "vw_registros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwRegistros.findAll", query = "SELECT v FROM VwRegistros v"),
    @NamedQuery(name = "VwRegistros.findById", query = "SELECT v FROM VwRegistros v WHERE v.id = :id"),
    @NamedQuery(name = "VwRegistros.findByIdParcela", query = "SELECT v FROM VwRegistros v WHERE v.idParcela = :idParcela"),
    @NamedQuery(name = "VwRegistros.findByEtapa", query = "SELECT v FROM VwRegistros v WHERE v.etapa = :etapa"),
    @NamedQuery(name = "VwRegistros.findByEtapaf", query = "SELECT v FROM VwRegistros v WHERE v.etapaf = :etapaf"),
    @NamedQuery(name = "VwRegistros.findByFecha", query = "SELECT v FROM VwRegistros v WHERE v.fecha = :fecha"),
    @NamedQuery(name = "VwRegistros.findByActividad", query = "SELECT v FROM VwRegistros v WHERE v.actividad = :actividad"),
    @NamedQuery(name = "VwRegistros.findByCategoria", query = "SELECT v FROM VwRegistros v WHERE v.categoria = :categoria"),
    @NamedQuery(name = "VwRegistros.findByCategoriaf", query = "SELECT v FROM VwRegistros v WHERE v.categoriaf = :categoriaf"),
    @NamedQuery(name = "VwRegistros.findByArvenses", query = "SELECT v FROM VwRegistros v WHERE v.arvenses = :arvenses"),
    @NamedQuery(name = "VwRegistros.findByPractica", query = "SELECT v FROM VwRegistros v WHERE v.practica = :practica"),
    @NamedQuery(name = "VwRegistros.findByPracticaf", query = "SELECT v FROM VwRegistros v WHERE v.practicaf = :practicaf"),
    @NamedQuery(name = "VwRegistros.findByUnidad", query = "SELECT v FROM VwRegistros v WHERE v.unidad = :unidad"),
    @NamedQuery(name = "VwRegistros.findByUnidadf", query = "SELECT v FROM VwRegistros v WHERE v.unidadf = :unidadf"),
    @NamedQuery(name = "VwRegistros.findByCantidad", query = "SELECT v FROM VwRegistros v WHERE v.cantidad = :cantidad"),
    @NamedQuery(name = "VwRegistros.findByPrecio", query = "SELECT v FROM VwRegistros v WHERE v.precio = :precio"),
    @NamedQuery(name = "VwRegistros.findByIncidencias", query = "SELECT v FROM VwRegistros v WHERE v.incidencias = :incidencias"),
    @NamedQuery(name = "VwRegistros.findByObservaciones", query = "SELECT v FROM VwRegistros v WHERE v.observaciones = :observaciones"),
    @NamedQuery(name = "VwRegistros.findByMuestreo", query = "SELECT v FROM VwRegistros v WHERE v.muestreo = :muestreo")})
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
    private String actividad;
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

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
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
