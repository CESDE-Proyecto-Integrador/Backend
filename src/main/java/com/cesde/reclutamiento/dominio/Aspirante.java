package com.cesde.reclutamiento.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aspirante extends Persona {
    private int documento;
    private String cargoAplicado;
    private String experiencia;
    private String estadoProceso;
    private Date fechaRegistro;
    
    // Relación: Aplica a 1..* Vacante
    private List<Vacante> vacantes;

    public Aspirante() {
        super();
        this.vacantes = new ArrayList<>();
    }

    public Aspirante(int id, String nombre, String telefono, String email, int documento, String cargoAplicado, String experiencia, String estadoProceso, Date fechaRegistro) {
        super(id, nombre, telefono, email);
        this.documento = documento;
        this.cargoAplicado = cargoAplicado;
        this.experiencia = experiencia;
        this.estadoProceso = estadoProceso;
        this.fechaRegistro = fechaRegistro;
        this.vacantes = new ArrayList<>();
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCargoAplicado() {
        return cargoAplicado;
    }

    public void setCargoAplicado(String cargoAplicado) {
        this.cargoAplicado = cargoAplicado;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Vacante> getVacantes() {
        return vacantes;
    }

    public void setVacantes(List<Vacante> vacantes) {
        this.vacantes = vacantes;
    }

    @Override
    public String toString() {
        return "Aspirante{" +
                "documento=" + documento +
                ", cargoAplicado='" + cargoAplicado + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", estadoProceso='" + estadoProceso + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                "} " + super.toString();
    }
}
