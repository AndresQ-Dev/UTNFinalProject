package model;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tecnico")
public class Tecnico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="cuil", unique = true,nullable = false)
    private String cuil;
    
    @Column(name = "apellidoNombre",nullable = false)
    private String apellidoNombre;

    @Column(name = "especialidad",nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumTipoServicio categoria;

    @Column(name = "estado")
    private boolean estado;
    @Column(name = "disponibilidad")
    private boolean disponibilidad;

    public Tecnico() {
    }

    public Tecnico(String cuil, String apellidoNombre, EnumTipoServicio categoria, boolean estado, boolean disponibilidad) {
        this.cuil = cuil;
        this.apellidoNombre = apellidoNombre;
        this.categoria = categoria;
        this.estado = estado;
        this.disponibilidad = disponibilidad;
    }

    public Tecnico(int id, String cuil, String apellidoNombre, EnumTipoServicio categoria, boolean estado, boolean disponibilidad) {
        this.id = id;
        this.cuil = cuil;
        this.apellidoNombre = apellidoNombre;
        this.categoria = categoria;
        this.estado = estado;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public EnumTipoServicio getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumTipoServicio categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    

}
