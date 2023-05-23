/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anec.conacyt.modelo.view;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "vw_parcelas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwParcelas.findAll", query = "SELECT v FROM VwParcelas v"),
    @NamedQuery(name = "VwParcelas.findById", query = "SELECT v FROM VwParcelas v WHERE v.id = :id"),
    @NamedQuery(name = "VwParcelas.findByIdPredio", query = "SELECT v FROM VwParcelas v WHERE v.idPredio = :idPredio"),
    @NamedQuery(name = "VwParcelas.findByIdtip", query = "SELECT v FROM VwParcelas v WHERE v.idtip = :idtip"),
    @NamedQuery(name = "VwParcelas.findByAnio", query = "SELECT v FROM VwParcelas v WHERE v.anio = :anio"),
    @NamedQuery(name = "VwParcelas.findByCiclo", query = "SELECT v FROM VwParcelas v WHERE v.ciclo = :ciclo"),
    @NamedQuery(name = "VwParcelas.findByCultivo", query = "SELECT v FROM VwParcelas v WHERE v.cultivo = :cultivo"),
    @NamedQuery(name = "VwParcelas.findBySemilla", query = "SELECT v FROM VwParcelas v WHERE v.semilla = :semilla"),
    @NamedQuery(name = "VwParcelas.findByVariedad", query = "SELECT v FROM VwParcelas v WHERE v.variedad = :variedad"),
    @NamedQuery(name = "VwParcelas.findByFechaSiembra", query = "SELECT v FROM VwParcelas v WHERE v.fechaSiembra = :fechaSiembra"),
    @NamedQuery(name = "VwParcelas.findByDensidadSiembra", query = "SELECT v FROM VwParcelas v WHERE v.densidadSiembra = :densidadSiembra"),
    @NamedQuery(name = "VwParcelas.findByTipo", query = "SELECT v FROM VwParcelas v WHERE v.tipo = :tipo")})
public class VwParcelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
     @Id
    private Integer id;
    @Column(name = "id_predio")
    private Integer idPredio;
    @Column(name = "idtip")
    private Integer idtip;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "ciclo")
    private String ciclo;
    @Column(name = "cultivo")
    private String cultivo;
    @Column(name = "semilla")
    private String semilla;
    @Column(name = "variedad")
    private String variedad;
    @Column(name = "fecha_siembra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSiembra;
    @Column(name = "densidad_siembra")
    private BigInteger densidadSiembra;
    @Column(name = "tipo")
    private String tipo;

    public VwParcelas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(Integer idPredio) {
        this.idPredio = idPredio;
    }

    public Integer getIdtip() {
        return idtip;
    }

    public void setIdtip(Integer idtip) {
        this.idtip = idtip;
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

    public String getSemilla() {
        return semilla;
    }

    public void setSemilla(String semilla) {
        this.semilla = semilla;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public Date getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(Date fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public BigInteger getDensidadSiembra() {
        return densidadSiembra;
    }

    public void setDensidadSiembra(BigInteger densidadSiembra) {
        this.densidadSiembra = densidadSiembra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
