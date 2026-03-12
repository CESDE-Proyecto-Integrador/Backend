package com.cesde.reclutamiento.dominio;

public class Vacante {
    private int idVacante;
    private String titulo;
    private String descripcion;
    private double salario;
    private String estado;

    public Vacante() {
    }

    public Vacante(int idVacante, String titulo, String descripcion, double salario, String estado) {
        this.idVacante = idVacante;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salario = salario;
        this.estado = estado;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vacante{" +
                "idVacante=" + idVacante +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", salario=" + salario +
                ", estado='" + estado + '\'' +
                '}';
    }
}
