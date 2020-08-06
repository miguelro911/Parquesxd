/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;

import Abstraccion.ServicioFichas;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Azul4 implements ServicioFichas {
    
    protected int x;
    protected int y;

    int recorridoAzul[][] = {{432, 407, 382, 357, 334, 334, 334, 334, 334, 334, 334, 334,
        266, 201, 201, 201, 201, 201, 201, 201, 201, 178, 153, 128, 103, 78, 53, 28, 3, 3, 3, 28,
        53, 78, 103, 128, 153, 178, 199, 199, 199, 199, 199, 199, 199, 199, 268, 334, 334, 334,
        334, 334, 334, 334, 334, 357, 382, 407, 432, 457, 482, 507, 532, 532, 507, 482, 457, 432,
        407, 382, 357, 332}, {200, 200, 200, 200, 178, 153, 128, 103, 78, 53, 28, 3, 3, 3, 28,
        53, 78, 103, 128, 153, 178, 199, 199, 199, 199, 199, 199, 199, 199, 268, 334, 334,
        334, 334, 334, 334, 334, 334, 357, 382, 407, 432, 457, 482, 507, 532, 532, 532, 507,
        482, 457, 432, 407, 382, 357, 336, 336, 336, 336, 336, 336, 336, 336, 268, 268, 268,
        268, 268, 268, 268, 268, 268}};
    
    public Azul4(int x, int y) {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public JButton Recorrido(JButton f, int sum) {
        System.out.println("x" + recorridoAzul[0][x]);
        System.out.println("y" + recorridoAzul[1][y]);
        f.setBounds(recorridoAzul[0][x + sum], recorridoAzul[1][y + sum], 20, 20);
        return f;
    }

    @Override
    public int posficha(JButton n) {
        for (int i = 0; i < 63; i++) {
            if (n.getX() == recorridoAzul[0][i] && n.getY() == recorridoAzul[1][i]) {
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }

}
