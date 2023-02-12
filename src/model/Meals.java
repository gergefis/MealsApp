/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author dimitris
 */
@Entity
@Table(name = "MEALS")
@NamedQueries({
    @NamedQuery(name = "Meals.findAll", query = "SELECT m FROM Meals m"),
    @NamedQuery(name = "Meals.findById", query = "SELECT m FROM Meals m WHERE m.id = :id"),
    @NamedQuery(name = "Meals.findByName", query = "SELECT m FROM Meals m WHERE m.name = :name"),
    @NamedQuery(name = "Meals.findByCategory", query = "SELECT m FROM Meals m WHERE m.category = :category"),
    @NamedQuery(name = "Meals.findByArea", query = "SELECT m FROM Meals m WHERE m.area = :area"),
    @NamedQuery(name = "Meals.findByInstructions", query = "SELECT m FROM Meals m WHERE m.instructions = :instructions")})
public class Meals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "AREA")
    private String area;
    @Column(name = "INSTRUCTIONS")
    private String instructions;

    public Meals() {
    }

    public Meals(Integer id) {
        this.id = id;
    }

    public Meals(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
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
        if (!(object instanceof Meals)) {
            return false;
        }
        Meals other = (Meals) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Meals[ id=" + id + " ]";
    }

    
    public void print() {
        System.out.println("-".repeat(70));
        System.out.println("| " + id + " | " 
                + name +"  | " 
                + category + " | " 
                + area + " | " 
                + instructions + " | " );
    }
    
    
    
}
