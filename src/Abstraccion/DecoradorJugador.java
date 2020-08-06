/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import Jugador_Base.Jugador;

/**
 *
 * @author USER
 */
public abstract class DecoradorJugador extends Jugador{

    public DecoradorJugador(String nombre) {
        super(nombre);
    }
    public abstract String getColor();
}
