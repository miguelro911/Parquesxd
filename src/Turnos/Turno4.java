/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turnos;

import Abstraccion.ManejoTurnos;
import javax.swing.JButton;

/**
 *
 * @author USER
 */
public class Turno4 implements ManejoTurnos {
    
    private final int TipoD = 4;//el atributo contiene el identificador si la
    //peticion debe ser respondida por este dpto

    public Turno4() {
    }

    @Override
    public void getTurno(int turno, JButton btn1, JButton btn2, JButton btn3, JButton btn4) {  // metodo sobreescrito para responder la solicitud del cliente

        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        btn4.setVisible(true);
    }
}
