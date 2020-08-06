/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Abstraccion.Fichas;
import Abstraccion.ServicioFichas;
import ProductosConcretos.*;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Verde implements Fichas {

    protected JButton boton;

    @Override
    public ServicioFichas CrearFicha(int opc, JButton bt, int sum) {
        boton = bt;
        if (opc == 1) {
            return new Verde1(0, 0);
        }
        if (opc == 2) {
            return new Verde2(0, 0);
        }
        if (opc == 3) {
            return new Verde3(0, 0);
        }
        if (opc == 4) {
            return new Verde4(0, 0);
        } else {
            return null;
        }
    }
}
