package com.cesde.reclutamiento.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un reclutador que gestiona procesos de selección.
 * Hereda de Persona.
 */
public class Reclutador extends Persona {
    private int idEmpleado;
    private String area;
    private String cargo;
    
    // Relación: Gestiona 0..* ProcesoSelección
    private List<ProcesoSeleccion> procesosGestionados;

    public Reclutador() {
        super();
        this.procesosGestionados = new ArrayList<>();
    }

    public Reclutador(int id, String nombre, String telefono, String email, int idEmpleado, String area, String cargo) {
        super(id, nombre, telefono, email);
        this.idEmpleado = idEmpleado;
        this.area = area;
        this.cargo = cargo;
        this.procesosGestionados = new ArrayList<>();
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<ProcesoSeleccion> getProcesosGestionados() {
        return procesosGestionados;
    }

    public void setProcesosGestionados(List<ProcesoSeleccion> procesosGestionados) {
        this.procesosGestionados = procesosGestionados;
    }

    @Override
    public String toString() {
        return "Reclutador{" +
                "idEmpleado=" + idEmpleado +
                ", area='" + area + '\'' +
                ", cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}
