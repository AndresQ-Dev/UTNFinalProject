
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
@Table(name="Tecnico")
public class Tecnico implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "apellidoNombre")
    private String apellidoNombre;
    
    @Column(name = "especialidad")
    @Enumerated(EnumType.STRING)
    private Especialidad categoria;
    
    private boolean estado;

    public Tecnico() {
    }

    public Tecnico(String apellidoNombre, Especialidad categoria, boolean estado) {
        this.apellidoNombre = apellidoNombre;
        this.categoria = categoria;
        this.estado = estado;
    }

    public Tecnico(int id, String apellidoNombre, Especialidad categoria, boolean estado) {
        this.id = id;
        this.apellidoNombre = apellidoNombre;
        this.categoria = categoria;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public Especialidad getCategoria() {
        return categoria;
    }

    public void setCategoria(Especialidad categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
