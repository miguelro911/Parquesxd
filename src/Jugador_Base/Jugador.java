/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador_Base;

/**
 *
 * @author USER
 */
public class Jugador {

    private String nom; // atributo tipo String

    public Jugador(String nombre) { // contructor de clase

        this.nom = nombre;
    }

    public String getNom() { // metodo get del atributo nom

        return nom;
    }

    public void setNom(String nombre) { // metodo set del atributo nom

        this.nom = nombre;
    }

    public String getColor() { // elementos minimos de la bicicleta
        return "";
    }
}
