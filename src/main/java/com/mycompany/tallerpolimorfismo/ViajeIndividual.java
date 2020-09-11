package com.mycompany.tallerpolimorfismo;

import java.util.Date;

/**
 *
 * @author Alejandro Latorre Pabón
 */
public class ViajeIndividual extends Viaje {
    // Constructor

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    /**
     * Metodo sobreescribe al metodo descripción indicando que se trata de un
     * viaje Individual
     *
     * @return una cadena con la descripción
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //No se sobreescribe cualquierMetodo2()
}
