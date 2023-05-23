/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anec.conacyt.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "parcelas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parcelas.findAll", query = "SELECT p FROM Parcelas p"),
    @NamedQuery(name = "Parcelas.findById", query = "SELECT p FROM Parcelas p WHERE p.id = :id"),
    @NamedQuery(name = "Parcelas.findByIdPredio", query = "SELECT p FROM Parcelas p WHERE p.idPredio = :idPredio"),
    @NamedQuery(name = "Parcelas.findByTipo", query = "SELECT p FROM Parcelas p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Parcelas.findByAnio", query = "SELECT p FROM Parcelas p WHERE p.anio = :anio"),
    @NamedQuery(name = "Parcelas.findByCiclo", query = "SELECT p FROM Parcelas p WHERE p.ciclo = :ciclo"),
    @NamedQuery(name = "Parcelas.findByCultivo", query = "SELECT p FROM Parcelas p WHERE p.cultivo = :cultivo"),
    @NamedQuery(name = "Parcelas.findBySemilla", query = "SELECT p FROM Parcelas p WHERE p.semilla = :semilla"),
    @NamedQuery(name = "Parcelas.findByVariedad", query = "SELECT p FROM Parcelas p WHERE p.variedad = :variedad"),
    @NamedQuery(name = "Parcelas.findByFechaSiembra", query = "SELECT p FROM Parcelas p WHERE p.fechaSiembra = :fechaSiembra"),
    @NamedQuery(name = "Parcelas.findByDensidadSiembra", query = "SELECT p FROM Parcelas p WHERE p.densidadSiembra = :densidadSiembra")})
public class Parcelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_predio")
    private int idPredio;
    @Basic(optional = false)
    @Column(name = "tipo")
    private int tipo;
    @Basic(optional = false)
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
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

    public Parcelas() {
    }

    public Parcelas(Integer id) {
        this.id = id;
    }

    public Parcelas(Integer id, int idPredio, int tipo, int anio, String ciclo) {
        this.id = id;
        this.idPredio = idPredio;
        this.tipo = tipo;
        this.anio = anio;
        this.ciclo = ciclo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(int idPredio) {
        this.idPredio = idPredio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcelas)) {
            return false;
        }
        Parcelas other = (Parcelas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.anec.conacyt.modelo.Parcelas[ id=" + id + " ]";
    }
    
}
