/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoradorColores;

import Abstraccion.DecoradorJugador;
import Jugador_Base.Jugador;

/**
 *
 * @author USER
 */
public class DecoAmarillo extends DecoradorJugador {

    private Jugador j;

    public DecoAmarillo(Jugador jug, String nombre) {
        super(nombre);
        this.j = jug;
    }

    @Override
    public String getColor() {
        return j.getColor() + "Amarillo";
    }

}
