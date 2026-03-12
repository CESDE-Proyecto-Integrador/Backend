package com.cesde.reclutamiento.dominio;

import java.util.Date;

public class Entrevista {
    private int idEntrevista;
    private Date fecha;
    private String resultado;
    private String comentarios;

    // Relaciones
    private ProcesoSeleccion procesoSeleccion;
    private Reclutador reclutador;

    public Entrevista() {
    }

    public Entrevista(int idEntrevista, Date fecha, String resultado, String comentarios) {
        this.idEntrevista = idEntrevista;
        this.fecha = fecha;
        this.resultado = resultado;
        this.comentarios = comentarios;
    }

    public int getIdEntrevista() {
        return idEntrevista;
    }

    public void setIdEntrevista(int idEntrevista) {
        this.idEntrevista = idEntrevista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public ProcesoSeleccion getProcesoSeleccion() {
        return procesoSeleccion;
    }

    public void setProcesoSeleccion(ProcesoSeleccion procesoSeleccion) {
        this.procesoSeleccion = procesoSeleccion;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }

    @Override
    public String toString() {
        return "Entrevista{" +
                "idEntrevista=" + idEntrevista +
                ", fecha=" + fecha +
                ", resultado='" + resultado + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}

