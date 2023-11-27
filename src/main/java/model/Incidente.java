package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Incidente")
public class Incidente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idIncidente;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idTecnico", nullable = false)
    private Tecnico tecnico;

    @Column(name = "categoria", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumTipoServicio categoriaServicio;

    @Column(name = "detalle", nullable = false)
    private String detalle;

    @Column(name = "observacionesTecnico")
    private String observacionesTecnico;

    @Column(name = "fechaAlta", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "fechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinalizacion;

    @Column(name = "estado")
    private boolean estado;

    public Incidente() {
    }

    public Incidente(Cliente cliente, Tecnico tecnico, EnumTipoServicio categoriaServicio, String detalle, String observacionesTecnico, Date fechaAlta, Date fechaFinalizacion, boolean estado) {
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.categoriaServicio = categoriaServicio;
        this.detalle = detalle;
        this.observacionesTecnico = observacionesTecnico;
        this.fechaAlta = fechaAlta;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
    }

    public Incidente(Cliente cliente, Tecnico tecnico, EnumTipoServicio categoriaServicio, String detalle, Date fechaAlta, boolean estado) {
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.categoriaServicio = categoriaServicio;
        this.detalle = detalle;
        this.fechaAlta = fechaAlta;
        this.estado = estado;
    }

    public Incidente(int idIncidente, Cliente cliente, Tecnico tecnico, EnumTipoServicio categoriaServicio, String detalle, String observacionesTecnico, Date fechaAlta, Date fechaFinalizacion, boolean estado) {
        this.idIncidente = idIncidente;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.categoriaServicio = categoriaServicio;
        this.detalle = detalle;
        this.observacionesTecnico = observacionesTecnico;
        this.fechaAlta = fechaAlta;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public EnumTipoServicio getCategoriaServicio() {
        return categoriaServicio;
    }

    public void setCategoriaServicio(EnumTipoServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getObservacionesTecnico() {
        return observacionesTecnico;
    }

    public void setObservacionesTecnico(String observacionesTecnico) {
        this.observacionesTecnico = observacionesTecnico;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
