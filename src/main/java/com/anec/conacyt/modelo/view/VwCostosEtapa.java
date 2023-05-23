/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anec.conacyt.modelo.view;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bsandoval
 */
@Entity
@Table(name = "vw_costos_etapa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwCostosEtapa.findAll", query = "SELECT v FROM VwCostosEtapa v"),
    @NamedQuery(name = "VwCostosEtapa.findById", query = "SELECT v FROM VwCostosEtapa v WHERE v.id = :id"),
    @NamedQuery(name = "VwCostosEtapa.findByIdParcela", query = "SELECT v FROM VwCostosEtapa v WHERE v.idParcela = :idParcela"),
    @NamedQuery(name = "VwCostosEtapa.findByEtapa", query = "SELECT v FROM VwCostosEtapa v WHERE v.etapa = :etapa"),
    @NamedQuery(name = "VwCostosEtapa.findByEtap", query = "SELECT v FROM VwCostosEtapa v WHERE v.etap = :etap"),
    @NamedQuery(name = "VwCostosEtapa.findByIdtip", query = "SELECT v FROM VwCostosEtapa v WHERE v.idtip = :idtip"),
    @NamedQuery(name = "VwCostosEtapa.findByTipo", query = "SELECT v FROM VwCostosEtapa v WHERE v.tipo = :tipo"),
    @NamedQuery(name = "VwCostosEtapa.findByCosto", query = "SELECT v FROM VwCostosEtapa v WHERE v.costo = :costo")})
public class VwCostosEtapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    private String id;
    @Column(name = "id_parcela")
    private Integer idParcela;
    @Column(name = "etapa")
    @Id
    private Integer etapa;
    @Column(name = "etap")
    private String etap;
    @Column(name = "idtip")
    private Integer idtip;
    @Column(name = "tipo")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo")
    private Double costo;

    public VwCostosEtapa() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getEtap() {
        return etap;
    }

    public void setEtap(String etap) {
        this.etap = etap;
    }

    public Integer getIdtip() {
        return idtip;
    }

    public void setIdtip(Integer idtip) {
        this.idtip = idtip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
}
