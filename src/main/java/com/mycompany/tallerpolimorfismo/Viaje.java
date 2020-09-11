/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallerpolimorfismo;

import java.util.Date;

/**
 *
 * @author Alejandro Latorre Pabón
 */
public abstract class Viaje {

    /**
     * Lugar de origen del viaje
     */
    protected String origen;
    /**
     * Lugar de destino del viaje
     */
    protected String destino;
    /**
     * Costo del viaje
     */
    protected int costo;
    /**
     * Fecha de salida del viaje
     */
    protected Date fechaSalida;
    /**
     * Fecha de llegada del viaje
     */
    protected Date fechaLlegada;

    // Constructores, getters y setters
    /**
     * Constructor parametrizado que inicializa todos los atributos de la clase
     * Viaje
     *
     * @param origen Lugar de origen del viaje
     * @param destino Lugar de destino del viaje
     * @param costo Costo del viaje
     * @param fechaSalida Fecha de salida del viaje
     * @param fechaLlegada Fecha de llegada del viaje
     */
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    /**
     * Metodo abstracto que da una descripcion que indica el tipo de viaje
     *
     * @return una cadena con la descripción
     */
    public abstract String descripcion();

    /**
     * Metodo que se mantendrá a igual en las clases derivadas con el fin de
     * probar uno de los usos de herencia y polimorfismo
     *
     * @return Una cadena que dice Cualquier método implementado en la clase
     * base
     */
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }

    /**
     * Metodo que se sobreescribirá en las clases derivadas con el fin de probar
     * uno de los usos de herencia y polimorfismo
     *
     * @return Una cadena que dice "Cualquier método implementado en la clase
     * base" en caso de no ser sobreescrito
     */
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
}
