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
public class Azul implements Fichas {

    @Override
    public ServicioFichas CrearFicha(int opc, JButton bt, int sum) {
        if (opc == 1) {
            return new Azul1(0, 0);
        }
        if (opc == 2) {
            return new Azul2(0, 0);
        }
        if (opc == 3) {
            return new Azul3(0, 0);
        }
        if (opc == 4) {
            return new Azul4(0, 0);
        } else {
            return null;
        }
    }

}
