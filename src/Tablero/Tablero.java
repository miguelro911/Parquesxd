/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero;

/**
 *
 * @author User
 */
public class Tablero {
    private static Tablero inst; // referencia de la clase Instancia
    private String ruta; // atributo de tipo String

    public Tablero(String ruta) {
        this.ruta = ruta;
    }
    
    public static Tablero getInstancia(String ruta) { // metodo publico estatico para crear objeto de tipo Instancia
        if (inst == null) {
            inst = new Tablero(ruta); // crea objeto de tipo Instancia
        }
        return inst;
    }

    public void setruta(String mensa) { // metodo set del atributo valor
        this.ruta = mensa;
    }

    public String getruta() { // metodo get del atributo valor
        return ruta;
    }
    
}
