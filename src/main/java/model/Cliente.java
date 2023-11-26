package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    @Basic
    @Column(name = "cuit", unique = true,nullable = false)
    private String cuit;
    @Basic
    @Column(name = "razonSocial",nullable = false)
    private String razonSocial;
    //private String nombreFantasia;
    @Column(name = "estado")
    private boolean estado;
    //Enum
    @Column(name = "tipoServicio",nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumTipoServicio tipoServicio;

    @Column(name = "direccion",nullable = false)
    private String Direccion;
    @Column(name = "telefono",nullable = false)
    private String telefono;
    @Column(name = "mail",nullable = false)
    private String mail;

    public Cliente() {
    }

    public Cliente(String cuit, String razonSocial, boolean estado, EnumTipoServicio tipoServicio, String Direccion, String telefono, String mail) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.estado = estado;
        this.tipoServicio = tipoServicio;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Cliente(int id, String cuit, String razonSocial, boolean estado, EnumTipoServicio tipoServicio, String Direccion, String telefono, String mail) {
        this.id = id;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.estado = estado;
        this.tipoServicio = tipoServicio;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public EnumTipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(EnumTipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", cuit=" + cuit + ", razonSocial=" + razonSocial + ", estado=" + estado + ", tipoServicio=" + tipoServicio + ", Direccion=" + Direccion + ", telefono=" + telefono + ", mail=" + mail + '}';
    }

    
}
