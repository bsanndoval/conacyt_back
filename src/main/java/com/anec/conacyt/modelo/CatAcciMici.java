/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.anec.conacyt.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "cat_acci_mici")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatAcciMici.findAll", query = "SELECT c FROM CatAcciMici c"),
    @NamedQuery(name = "CatAcciMici.findById", query = "SELECT c FROM CatAcciMici c WHERE c.id = :id"),
    @NamedQuery(name = "CatAcciMici.findByCategoria", query = "SELECT c FROM CatAcciMici c WHERE c.categoria = :categoria")})
public class CatAcciMici implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public CatAcciMici() {
    }

    public CatAcciMici(Integer id) {
        this.id = id;
    }

    public CatAcciMici(Integer id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        if (!(object instanceof CatAcciMici)) {
            return false;
        }
        CatAcciMici other = (CatAcciMici) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.proyecto1.modelo.CatAcciMici[ id=" + id + " ]";
    }
    
}
