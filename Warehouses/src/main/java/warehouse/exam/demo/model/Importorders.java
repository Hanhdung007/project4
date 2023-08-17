/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warehouse.exam.demo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DUNG
 */
@Entity
@Table(name = "importorders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Importorders.findAll", query = "SELECT i FROM Importorders i"),
    @NamedQuery(name = "Importorders.findById", query = "SELECT i FROM Importorders i WHERE i.id = :id"),
    @NamedQuery(name = "Importorders.findByDriver", query = "SELECT i FROM Importorders i WHERE i.driver = :driver"),
    @NamedQuery(name = "Importorders.findByDriversPhone", query = "SELECT i FROM Importorders i WHERE i.driversPhone = :driversPhone"),
    @NamedQuery(name = "Importorders.findByFactory", query = "SELECT i FROM Importorders i WHERE i.factory = :factory"),
    @NamedQuery(name = "Importorders.findByDateImport", query = "SELECT i FROM Importorders i WHERE i.dateImport = :dateImport"),
    @NamedQuery(name = "Importorders.findByNote", query = "SELECT i FROM Importorders i WHERE i.note = :note"),
    @NamedQuery(name = "Importorders.findByStatus", query = "SELECT i FROM Importorders i WHERE i.status = :status")})
public class Importorders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "driver")
    private String driver;
    @Size(max = 255)
    @Column(name = "drivers_phone")
    private String driversPhone;
    @Size(max = 255)
    @Column(name = "factory")
    private String factory;
    @Size(max = 255)
    @Column(name = "date_import")
    private String dateImport;
    @Size(max = 255)
    @Column(name = "note")
    private String note;
    @Column(name = "status")
    private Boolean status;
    @OneToMany(mappedBy = "idImport")
    private List<Itemmasters> itemmastersList;

    public Importorders() {
    }

    public Importorders(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriversPhone() {
        return driversPhone;
    }

    public void setDriversPhone(String driversPhone) {
        this.driversPhone = driversPhone;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getDateImport() {
        return dateImport;
    }

    public void setDateImport(String dateImport) {
        this.dateImport = dateImport;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @XmlTransient
    public List<Itemmasters> getItemmastersList() {
        return itemmastersList;
    }

    public void setItemmastersList(List<Itemmasters> itemmastersList) {
        this.itemmastersList = itemmastersList;
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
        if (!(object instanceof Importorders)) {
            return false;
        }
        Importorders other = (Importorders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "warehouse.exam.demo.model.Importorders[ id=" + id + " ]";
    }
    
}