/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anec.conacyt.modelo.view;

import java.io.Serializable;
import java.math.BigInteger;
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
    @NamedQuery(name = "VwCostosEtapa.findByIdParcela", query = "SELECT v FROM VwCostosEtapa v WHERE v.idParcela = :idParcela"),
    @NamedQuery(name = "VwCostosEtapa.findByEtapa", query = "SELECT v FROM VwCostosEtapa v WHERE v.etapa = :etapa"),
    @NamedQuery(name = "VwCostosEtapa.findByEtap", query = "SELECT v FROM VwCostosEtapa v WHERE v.etap = :etap"),
    @NamedQuery(name = "VwCostosEtapa.findByCosto", query = "SELECT v FROM VwCostosEtapa v WHERE v.costo = :costo")})
public class VwCostosEtapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_parcela")
    private Integer idParcela;
    @Column(name = "etapa")
    @Id
    private Integer etapa;
    @Column(name = "etap")
    private String etap;
    @Column(name = "costo")
    private BigInteger costo;

    public VwCostosEtapa() {
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

    public BigInteger getCosto() {
        return costo;
    }

    public void setCosto(BigInteger costo) {
        this.costo = costo;
    }
    
}
