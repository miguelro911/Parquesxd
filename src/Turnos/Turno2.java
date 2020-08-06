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
public class Turno2 implements ManejoTurnos{
    private final int TipoD = 2;//el atributo contiene el identificador si la
    //peticion debe ser respondida por este dpto
    private ManejoTurnos suceso;//parametor del sucesor en la cadena de responsabilidad

    public Turno2(ManejoTurnos s) {// objeto que implemena la inteface
        this.suceso = s;// al atributo de la asigna la interface
    }

    @Override
    public void getTurno(int turno, JButton btn1, JButton btn2, JButton btn3, JButton btn4) {  // metodo sobreescrito para responder la solicitud del cliente

        if (turno == TipoD) {
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn4.setVisible(true);
        } else {
            suceso.getTurno(turno, btn1, btn2, btn3, btn4);//llama el metodo del sucesor enciando el valor que ha 
            //solicitado el cliente
        }
    }
}
