/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import Jugador_Base.Jugador;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class VerificacionSeguro {
        public boolean verificacion(Jugador j, JButton btn, boolean bool){
        if ((btn.getX()==334 && btn.getY()==432) 
                || (btn.getX()==432 && btn.getY()==336)|| (btn.getX()==532 && btn.getY()==268)
                || (btn.getX()==334 && btn.getY()==103)
                || (btn.getX()==267 && btn.getY()==3)
                || (btn.getX()==432 && btn.getY()==336)
                || (btn.getX()==103 && btn.getY()==199)
                || (btn.getX()==3 && btn.getY()==268)
                || (btn.getX()==103 && btn.getY()==334)
                || (btn.getX()==199 && btn.getY()==432)
                || (btn.getX()==268 && btn.getY()==532)
                || (btn.getX()==432 && btn.getY()==200)
                || (btn.getX()==201 && btn.getY()==103)){
            System.out.println("Hola");
            return bool=true;
        }
        return bool=false;
    }
    
}
