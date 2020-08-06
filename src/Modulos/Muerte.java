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
public class Muerte {
    public void matar(Jugador j, JButton btn1, JButton btn2, int x, int y, boolean seg){
        if (btn1.getX()==btn2.getX() && btn1.getY()==btn2.getY() && seg==false){
            System.out.println("Muerte");
            btn2.setBounds(x, y, 20, 20);
        }
    }
    
}
