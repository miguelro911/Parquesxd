/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Jugador_Base.Jugador;
import Modulos.Muerte;
import Modulos.VerificacionSeguro;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class FacadeMuerte {
        public void sinreporte(Jugador j, JButton btn1, JButton btn2, int x, int y, boolean seg) { // metodo para analizar el estado del cliente que desea un prestamo
        System.out.println("Entre");
        if (new VerificacionSeguro().verificacion(j, btn1, seg)==true) {
            System.out.println("Esta asegurada");
        } else {
            seg=false;
            new Muerte().matar(j, btn1, btn2, x, y, seg);
            
        }
        
    }
}
