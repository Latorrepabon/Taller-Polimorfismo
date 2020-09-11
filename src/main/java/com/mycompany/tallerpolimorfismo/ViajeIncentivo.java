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
public class ViajeIncentivo extends Viaje {

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;
    //Constructor, getters and setters

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Metodo sobreescribe al metodo descripción indicando que se trata de un
     * viaje incentivo y especificando la empresa
     *
     * @return una cadena con la descripción
     */
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
