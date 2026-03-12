package com.cesde.reclutamiento.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa un proceso de selección iniciado por un reclutador.
 */
public class ProcesoSeleccion {
    private int idProceso;
    private Date fechaInicio;
    private String estado;
    private String observaciones;

    // Relaciones
    private Aspirante aspirante;
    private Vacante vacante;
    private Reclutador reclutador;
    private List<Entrevista> entrevistas;

    public ProcesoSeleccion() {
        this.entrevistas = new ArrayList<>();
    }

    public ProcesoSeleccion(int idProceso, Date fechaInicio, String estado, String observaciones, Aspirante aspirante, Vacante vacante, Reclutador reclutador) {
        this.idProceso = idProceso;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.observaciones = observaciones;
        this.aspirante = aspirante;
        this.vacante = vacante;
        this.reclutador = reclutador;
        this.entrevistas = new ArrayList<>();
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Aspirante getAspirante() {
        return aspirante;
    }

    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }

    public Vacante getVacante() {
        return vacante;
    }

    public void setVacante(Vacante vacante) {
        this.vacante = vacante;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }

    public List<Entrevista> getEntrevistas() {
        return entrevistas;
    }

    public void setEntrevistas(List<Entrevista> entrevistas) {
        this.entrevistas = entrevistas;
    }

    @Override
    public String toString() {
        return "ProcesoSeleccion{" +
                "idProceso=" + idProceso +
                ", fechaInicio=" + fechaInicio +
                ", estado='" + estado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
