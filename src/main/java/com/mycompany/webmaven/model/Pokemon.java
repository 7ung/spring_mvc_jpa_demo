/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webmaven.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Stevie
 */
@Entity
@Table(name = "pokemon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pokemon.findAll", query = "SELECT p FROM Pokemon p"),
    @NamedQuery(name = "Pokemon.findById", query = "SELECT p FROM Pokemon p WHERE p.id = :id"),
    @NamedQuery(name = "Pokemon.findByName", query = "SELECT p FROM Pokemon p WHERE p.name = :name"),
    @NamedQuery(name = "Pokemon.findBySpecies", query = "SELECT p FROM Pokemon p WHERE p.species = :species"),
    @NamedQuery(name = "Pokemon.findByHeight", query = "SELECT p FROM Pokemon p WHERE p.height = :height"),
    @NamedQuery(name = "Pokemon.findByWeight", query = "SELECT p FROM Pokemon p WHERE p.weight = :weight"),
    @NamedQuery(name = "Pokemon.findByJapanese", query = "SELECT p FROM Pokemon p WHERE p.japanese = :japanese")})
public class Pokemon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "species")
    private String species;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "height")
    private Float height;
    @Column(name = "weight")
    private Float weight;
    @Size(max = 45)
    @Column(name = "japanese")
    private String japanese;
    @JoinTable(name = "pokemon_type", joinColumns = {
        @JoinColumn(name = "pokemon_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "type_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Type> typeCollection;

    public Pokemon() {
    }

    public Pokemon(Integer id) {
        this.id = id;
    }

    public Pokemon(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    @XmlTransient
    public Collection<Type> getTypeCollection() {
        return typeCollection;
    }

    public void setTypeCollection(Collection<Type> typeCollection) {
        this.typeCollection = typeCollection;
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
        if (!(object instanceof Pokemon)) {
            return false;
        }
        Pokemon other = (Pokemon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.webmaven.model.Pokemon[ id=" + id + " ]";
    }
    
}
