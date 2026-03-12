package com.cesde.reclutamiento.dominio;

import java.util.ArrayList;
import java.util.List;

public class Reclutador extends Persona {
    private int idEmpleado;
    private String area;
    private String cargo;
    
    // Relaciones
    private List<ProcesoSeleccion> procesos;
    private List<Entrevista> entrevistas;

    public Reclutador() {
        super();
        this.procesos = new ArrayList<>();
        this.entrevistas = new ArrayList<>();
    }

    public Reclutador(int id, String nombre, String telefono, String email, int idEmpleado, String area, String cargo) {
        super(id, nombre, telefono, email);
        this.idEmpleado = idEmpleado;
        this.area = area;
        this.cargo = cargo;
        this.procesos = new ArrayList<>();
        this.entrevistas = new ArrayList<>();
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

    public List<ProcesoSeleccion> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<ProcesoSeleccion> procesos) {
        this.procesos = procesos;
    }

    public List<Entrevista> getEntrevistas() {
        return entrevistas;
    }

    public void setEntrevistas(List<Entrevista> entrevistas) {
        this.entrevistas = entrevistas;
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

