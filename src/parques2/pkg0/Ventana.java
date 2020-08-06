/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques2.pkg0;

import Abstraccion.Fichas;
import Abstraccion.ServicioFichas;
import Fabricas.*;
import Tablero.Tablero;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import Dados.Dado1;
import Dados.Dado2;
import DecoradorColores.DecoAmarillo;
import DecoradorColores.DecoAzul;
import DecoradorColores.DecoRojo;
import DecoradorColores.DecoVerde;
import Facade.FacadeMuerte;
import Jugador_Base.Jugador;
import Turnos.Turno1;
import Turnos.Turno2;
import Turnos.Turno3;
import Turnos.Turno4;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Ventana extends JFrame {

    String[] colores = {"Amarillo", "Azul", "Rojo", "Verde"};
    Tablero tab1 = Tablero.getInstancia("/img/Tablero2.png");
    FondoPanel fondo = new FondoPanel();

    private int turno = 1;
    Turno4 obj = new Turno4();
    Turno3 obj1 = new Turno3(obj);
    Turno2 obj2 = new Turno2(obj1);
    Turno1 obj3 = new Turno1(obj2);

    Jugador jugador1;
    Jugador jugador2;
    Jugador jugador3;
    Jugador jugador4;

    private int suma;
    private JPanel panel;
    private JPanel panel2;
    //private JLabel tab;
    private JLabel titulo;
    private JLabel jug1;
    private JLabel jug2;
    private JLabel jug3;
    private JLabel jug4;
    private JTextField nomJ1;
    private JTextField nomJ2;
    private JTextField nomJ3;
    private JTextField nomJ4;
    private JComboBox colorJ1;
    private JComboBox colorJ2;
    private JComboBox colorJ3;
    private JComboBox colorJ4;
    private JButton lanzaram;
    private JButton lanzaraz;
    private JButton lanzarver;
    private JButton lanzarro;
    private JLabel ama1;
    private JLabel ama2;
    private JLabel az1;
    private JLabel az2;
    private JLabel ro1;
    private JLabel ro2;
    private JLabel ver1;
    private JLabel ver2;
    private JButton dpa1;
    private JButton dpa2;
    private JButton dpa3;
    private JButton dpa4;
    private JButton dpaz1;
    private JButton dpaz2;
    private JButton dpaz3;
    private JButton dpaz4;
    private JButton dpv1;
    private JButton dpv2;
    private JButton dpv3;
    private JButton dpv4;
    private JButton dpr1;
    private JButton dpr2;
    private JButton dpr3;
    private JButton dpr4;
    private JButton jugar;

    public Ventana() {
        setSize(1000, 800); // tamaño de la ventana
        setLocationRelativeTo(null); // coloca la ventana en el centro
        setTitle("Proyecto Final Modelos de Programación I"); // titulo de la ventana
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // termina la ejecucion al cerrar la ventana
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        posIgualAm();
        posIgualRo();
        posIgualVer();
        posIgualAz();
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel2 = new FondoPanel();
        panel2.setBounds(220, 20, 555, 555);
        panel2.setLayout(null);
        panel2.setVisible(false);
        panel.add(panel2);
    }

    private void colocarEtiquetas() {
        /**
         * tab = new JLabel(new ImageIcon(tab1.getruta())); tab.setBounds(220,
         * 20, 550, 550); tab.setVisible(false); panel.add(tab);
         */

        titulo = new JLabel();
        titulo.setText("BIENVENIDO AL PARQUÉS");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(150, 20, 600, 30);
        titulo.setFont(new Font("cooper black", 0, 30));
        panel.add(titulo);

        jug1 = new JLabel();
        jug1.setHorizontalAlignment(SwingConstants.CENTER);
        jug1.setBounds(200, 120, 350, 30);
        jug1.setFont(new Font("cooper black", 0, 20));
        jug1.setText("Ingrese nombre del jugador: ");
        panel.add(jug1);

        jug2 = new JLabel();
        jug2.setHorizontalAlignment(SwingConstants.CENTER);
        jug2.setBounds(200, 160, 350, 30);
        jug2.setFont(new Font("cooper black", 0, 20));
        jug2.setText("Ingrese nombre del jugador: ");
        panel.add(jug2);

        jug3 = new JLabel();
        jug3.setHorizontalAlignment(SwingConstants.CENTER);
        jug3.setBounds(200, 200, 350, 30);
        jug3.setFont(new Font("cooper black", 0, 20));
        jug3.setText("Ingrese nombre del jugador: ");
        panel.add(jug3);

        jug4 = new JLabel();
        jug4.setHorizontalAlignment(SwingConstants.CENTER);
        jug4.setBounds(200, 240, 350, 30);
        jug4.setFont(new Font("cooper black", 0, 20));
        jug4.setText("Ingrese nombre del jugador: ");
        panel.add(jug4);

        nomJ1 = new JTextField();
        nomJ1.setBounds(530, 120, 100, 30);
        panel.add(nomJ1);

        nomJ2 = new JTextField();
        nomJ2.setBounds(530, 160, 100, 30);
        panel.add(nomJ2);

        nomJ3 = new JTextField();
        nomJ3.setBounds(530, 200, 100, 30);
        panel.add(nomJ3);

        nomJ4 = new JTextField();
        nomJ4.setBounds(530, 240, 100, 30);
        panel.add(nomJ4);

        ama1 = new JLabel();
        ama1.setHorizontalAlignment(SwingConstants.CENTER);
        ama1.setBounds(760, 480, 100, 30);
        ama1.setFont(new Font("cooper black", 0, 15));
        panel.add(ama1);

        ama2 = new JLabel();
        ama2.setHorizontalAlignment(SwingConstants.CENTER);
        ama2.setBounds(760, 500, 100, 30);
        ama2.setFont(new Font("cooper black", 0, 15));
        panel.add(ama2);

        az1 = new JLabel();
        az1.setHorizontalAlignment(SwingConstants.CENTER);
        az1.setBounds(760, 130, 100, 30);
        az1.setFont(new Font("cooper black", 0, 15));
        panel.add(az1);

        az2 = new JLabel();
        az2.setHorizontalAlignment(SwingConstants.CENTER);
        az2.setBounds(760, 150, 100, 30);
        az2.setFont(new Font("cooper black", 0, 15));
        panel.add(az2);

        ro1 = new JLabel();
        ro1.setHorizontalAlignment(SwingConstants.CENTER);
        ro1.setBounds(90, 130, 100, 30);
        ro1.setFont(new Font("cooper black", 0, 15));
        panel.add(ro1);

        ro2 = new JLabel();
        ro2.setHorizontalAlignment(SwingConstants.CENTER);
        ro2.setBounds(90, 150, 100, 30);
        ro2.setFont(new Font("cooper black", 0, 15));
        panel.add(ro2);

        ver1 = new JLabel();
        ver1.setHorizontalAlignment(SwingConstants.CENTER);
        ver1.setBounds(90, 480, 100, 30);
        ver1.setFont(new Font("cooper black", 0, 15));
        panel.add(ver1);

        ver2 = new JLabel();
        ver2.setHorizontalAlignment(SwingConstants.CENTER);
        ver2.setBounds(90, 500, 100, 30);
        ver2.setFont(new Font("cooper black", 0, 15));
        panel.add(ver2);
    }

    private void colocarBotones() {
        jugar = new JButton();
        jugar.setText("JUGAR");
        jugar.setBounds(400, 280, 100, 30);
        panel.add(jugar);

        colorJ1 = new JComboBox(colores);
        colorJ1.setBounds(660, 120, 100, 20);
        panel.add(colorJ1);

        colorJ2 = new JComboBox(colores);
        colorJ2.setBounds(660, 160, 100, 20);
        panel.add(colorJ2);

        colorJ3 = new JComboBox(colores);
        colorJ3.setBounds(660, 200, 100, 20);
        panel.add(colorJ3);

        colorJ4 = new JComboBox(colores);
        colorJ4.setBounds(660, 240, 100, 20);
        panel.add(colorJ4);

        dpa1 = new JButton();
        dpa1.setBackground(Color.yellow);
        dpa1.setBounds(432, 432, 20, 20);
        dpa1.setVisible(false);
        panel2.add(dpa1);

        dpa2 = new JButton();
        dpa2.setBackground(Color.yellow);
        dpa2.setBounds(482, 432, 20, 20);
        dpa2.setVisible(false);
        panel2.add(dpa2);

        dpa3 = new JButton();
        dpa3.setBackground(Color.yellow);
        dpa3.setBounds(432, 482, 20, 20);
        dpa3.setVisible(false);
        panel2.add(dpa3);

        dpa4 = new JButton();
        dpa4.setBackground(Color.yellow);
        dpa4.setBounds(482, 482, 20, 20);
        dpa4.setVisible(false);
        panel2.add(dpa4);

        dpaz1 = new JButton();
        dpaz1.setBackground(Color.blue);
        dpaz1.setBounds(432, 53, 20, 20);
        dpaz1.setVisible(false);
        panel2.add(dpaz1);

        dpaz2 = new JButton();
        dpaz2.setBackground(Color.blue);
        dpaz2.setBounds(482, 53, 20, 20);
        dpaz2.setVisible(false);
        panel2.add(dpaz2);

        dpaz3 = new JButton();
        dpaz3.setBackground(Color.blue);
        dpaz3.setBounds(432, 103, 20, 20);
        dpaz3.setVisible(false);
        panel2.add(dpaz3);

        dpaz4 = new JButton();
        dpaz4.setBackground(Color.blue);
        dpaz4.setBounds(482, 103, 20, 20);
        dpaz4.setVisible(false);
        panel2.add(dpaz4);

        dpr1 = new JButton();
        dpr1.setBackground(Color.red);
        dpr1.setBounds(53, 53, 20, 20);
        dpr1.setVisible(false);
        panel2.add(dpr1);

        dpr2 = new JButton();
        dpr2.setBackground(Color.red);
        dpr2.setBounds(103, 53, 20, 20);
        dpr2.setVisible(false);
        panel2.add(dpr2);

        dpr3 = new JButton();
        dpr3.setBackground(Color.red);
        dpr3.setBounds(53, 103, 20, 20);
        dpr3.setVisible(false);
        panel2.add(dpr3);

        dpr4 = new JButton();
        dpr4.setBackground(Color.red);
        dpr4.setBounds(103, 103, 20, 20);
        dpr4.setVisible(false);
        panel2.add(dpr4);

        dpv1 = new JButton();
        dpv1.setBackground(Color.green);
        dpv1.setBounds(53, 432, 20, 20);
        dpv1.setVisible(false);
        panel2.add(dpv1);

        dpv2 = new JButton();
        dpv2.setBackground(Color.green);
        dpv2.setBounds(103, 432, 20, 20);
        dpv2.setVisible(false);
        panel2.add(dpv2);

        dpv3 = new JButton();
        dpv3.setBackground(Color.green);
        dpv3.setBounds(53, 482, 20, 20);
        dpv3.setVisible(false);
        panel2.add(dpv3);

        dpv4 = new JButton();
        dpv4.setBackground(Color.green);
        dpv4.setBounds(103, 482, 20, 20);
        dpv4.setVisible(false);
        panel2.add(dpv4);

        lanzaram = new JButton();
        lanzaram.setText("Lanzar");
        lanzaram.setBackground(Color.yellow);
        lanzaram.setBounds(780, 460, 100, 20);
        lanzaram.setVisible(false);
        panel.add(lanzaram);

        lanzaraz = new JButton();
        lanzaraz.setText("Lanzar");
        lanzaraz.setBackground(Color.blue);
        lanzaraz.setBounds(780, 110, 100, 20);
        lanzaraz.setVisible(false);
        panel.add(lanzaraz);

        lanzarro = new JButton();
        lanzarro.setText("Lanzar");
        lanzarro.setBounds(110, 110, 100, 20);
        lanzarro.setBackground(Color.red);
        lanzarro.setVisible(false);
        panel.add(lanzarro);

        lanzarver = new JButton();
        lanzarver.setText("Lanzar");
        lanzarver.setBounds(110, 460, 100, 20);
        lanzarver.setBackground(Color.GREEN);
        lanzarver.setVisible(false);
        panel.add(lanzarver);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MueveAmarillo(new Amarillo());
                MueveAzul(new Azul());
                MueveRojo(new Rojo());
                MueveVerde(new Verde());
                //tab.setVisible(true);
                panel2.setVisible(true);
                jugar.setVisible(false);
                titulo.setVisible(false);
                jug1.setVisible(false);
                jug2.setVisible(false);
                jug3.setVisible(false);
                jug4.setVisible(false);
                colorJ1.setVisible(false);
                colorJ2.setVisible(false);
                colorJ3.setVisible(false);
                colorJ4.setVisible(false);
                dpa1.setVisible(true);
                dpa2.setVisible(true);
                dpa3.setVisible(true);
                dpa4.setVisible(true);
                dpaz1.setVisible(true);
                dpaz2.setVisible(true);
                dpaz3.setVisible(true);
                dpaz4.setVisible(true);
                dpr1.setVisible(true);
                dpr2.setVisible(true);
                dpr3.setVisible(true);
                dpr4.setVisible(true);
                dpv1.setVisible(true);
                dpv2.setVisible(true);
                dpv3.setVisible(true);
                dpv4.setVisible(true);
                obj3.getTurno(turno, lanzaraz, lanzarro, lanzarver, lanzaram);
                //Decorador de los jugadores
                jugador1 = new Jugador(jug1.getText());
                jugador2 = new Jugador(jug2.getText());
                jugador3 = new Jugador(jug3.getText());
                jugador4 = new Jugador(jug4.getText());
                if (colorJ1.getSelectedItem().equals("Amarillo")) {
                    jugador1 = new DecoAmarillo(jugador1, jugador1.getNom());
                    System.out.println(jugador1.getColor());
                    nomJ1.setBounds(780, 440, 100, 20);
                    nomJ1.setEditable(false);
                } else if (colorJ1.getSelectedItem().equals("Azul")) {
                    jugador1 = new DecoAzul(jugador1, jugador1.getNom());
                    System.out.println(jugador1.getColor());
                    nomJ1.setBounds(780, 90, 100, 20);
                    nomJ1.setEditable(false);
                } else if (colorJ1.getSelectedItem().equals("Rojo")) {
                    jugador1 = new DecoRojo(jugador1, jugador1.getNom());
                    System.out.println(jugador1.getColor());
                    nomJ1.setBounds(110, 90, 100, 20);
                    nomJ1.setEditable(false);
                } else if (colorJ1.getSelectedItem().equals("Verde")) {
                    jugador1 = new DecoVerde(jugador1, jugador1.getNom());
                    System.out.println(jugador1.getColor());
                    nomJ1.setBounds(110, 440, 100, 20);
                    nomJ1.setEditable(false);
                }

                if (colorJ2.getSelectedItem().equals("Amarillo")) {
                    jugador2 = new DecoAmarillo(jugador2, jugador2.getNom());
                    System.out.println(jugador2.getColor());
                    nomJ2.setBounds(780, 440, 100, 20);
                    nomJ2.setEditable(false);
                } else if (colorJ2.getSelectedItem().equals("Azul")) {
                    jugador2 = new DecoAzul(jugador2, jugador2.getNom());
                    System.out.println(jugador2.getColor());
                    nomJ2.setBounds(780, 90, 100, 20);
                    nomJ2.setEditable(false);
                } else if (colorJ2.getSelectedItem().equals("Rojo")) {
                    jugador2 = new DecoRojo(jugador2, jugador2.getNom());
                    System.out.println(jugador2.getColor());
                    nomJ2.setBounds(110, 90, 100, 20);
                    nomJ2.setEditable(false);
                } else if (colorJ2.getSelectedItem().equals("Verde")) {
                    jugador2 = new DecoVerde(jugador2, jugador2.getNom());
                    System.out.println(jugador2.getColor());
                    nomJ2.setBounds(110, 440, 100, 20);
                    nomJ2.setEditable(false);
                }

                if (colorJ3.getSelectedItem().equals("Amarillo")) {
                    jugador3 = new DecoAmarillo(jugador3, jugador3.getNom());
                    System.out.println(jugador3.getColor());
                    nomJ3.setBounds(780, 440, 100, 20);
                    nomJ3.setEditable(false);
                } else if (colorJ3.getSelectedItem().equals("Azul")) {
                    jugador3 = new DecoAzul(jugador3, jugador3.getNom());
                    System.out.println(jugador3.getColor());
                    nomJ3.setBounds(780, 90, 100, 20);
                    nomJ3.setEditable(false);
                } else if (colorJ3.getSelectedItem().equals("Rojo")) {
                    jugador3 = new DecoRojo(jugador3, jugador3.getNom());
                    System.out.println(jugador3.getColor());
                    nomJ3.setBounds(110, 90, 100, 20);
                    nomJ3.setEditable(false);
                } else if (colorJ3.getSelectedItem().equals("Verde")) {
                    jugador3 = new DecoVerde(jugador3, jugador3.getNom());
                    System.out.println(jugador3.getColor());
                    nomJ3.setBounds(110, 440, 100, 20);
                    nomJ3.setEditable(false);
                }

                if (colorJ4.getSelectedItem().equals("Amarillo")) {
                    jugador4 = new DecoAmarillo(jugador4, jugador4.getNom());
                    System.out.println(jugador4.getColor());
                    nomJ4.setBounds(780, 440, 100, 20);
                    nomJ4.setEditable(false);
                } else if (colorJ4.getSelectedItem().equals("Azul")) {
                    jugador4 = new DecoAzul(jugador4, jugador4.getNom());
                    System.out.println(jugador4.getColor());
                    nomJ4.setBounds(780, 90, 100, 20);
                    nomJ4.setEditable(false);
                } else if (colorJ4.getSelectedItem().equals("Rojo")) {
                    jugador4 = new DecoRojo(jugador4, jugador4.getNom());
                    System.out.println(jugador4.getColor());
                    nomJ4.setBounds(110, 90, 100, 20);
                    nomJ4.setEditable(false);
                } else if (colorJ4.getSelectedItem().equals("Verde")) {
                    jugador4 = new DecoVerde(jugador4, jugador4.getNom());
                    System.out.println(jugador4.getColor());
                    nomJ4.setBounds(110, 440, 100, 20);
                    nomJ4.setEditable(false);
                }
            }

        };
        jugar.addActionListener(accion);

        ActionListener lanzaam = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dado1 dado1 = new Dado1(1);
                ama1.setText(Integer.toString(dado1.getvalor1()));
                Dado2 dado2 = new Dado2(1);
                ama2.setText(Integer.toString(dado2.getvalor2()));
                turno++;
                obj3.getTurno(turno, lanzaram, lanzarro, lanzarver, lanzaraz);
            }
        };
        lanzaram.addActionListener(lanzaam);

        ActionListener lanzaaz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dado1 dado1 = new Dado1(1);
                az1.setText(Integer.toString(dado1.getvalor1()));
                Dado2 dado2 = new Dado2(1);
                az2.setText(Integer.toString(dado2.getvalor2()));
                turno++;
                obj3.getTurno(turno, lanzaram, lanzarver, lanzaraz, lanzarro);
            }
        };
        lanzaraz.addActionListener(lanzaaz);

        ActionListener lanzaro = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dado1 dado1 = new Dado1(1);
                ro1.setText(Integer.toString(dado1.getvalor1()));
                Dado2 dado2 = new Dado2(1);
                ro2.setText(Integer.toString(dado2.getvalor2()));
                turno++;
                obj3.getTurno(turno, lanzaram, lanzaraz, lanzarro, lanzarver);
            }
        };
        lanzarro.addActionListener(lanzaro);

        ActionListener lanzaver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dado1 dado1 = new Dado1(1);
                ver1.setText(Integer.toString(dado1.getvalor1()));
                Dado2 dado2 = new Dado2(0);
                ver2.setText(Integer.toString(dado2.getvalor2()));
                turno = 1;
                obj3.getTurno(turno, lanzaraz, lanzarro, lanzarver, lanzaram);

            }
        };
        lanzarver.addActionListener(lanzaver);

    }

    private void MueveAmarillo(Fichas fich) {
        ServicioFichas servicio1 = fich.CrearFicha(1, dpa1, 0);
        ServicioFichas servicio2 = fich.CrearFicha(2, dpa2, 0);
        ServicioFichas servicio3 = fich.CrearFicha(3, dpa3, 0);
        ServicioFichas servicio4 = fich.CrearFicha(4, dpa4, 0);

        ActionListener muevea1 = new ActionListener() {//630 437
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpa1.getX() == 432 && dpa1.getY() == 432 && ama1.getText().equals(ama2.getText())) {
                    servicio1.Recorrido(dpa1, 0);
                    //ama1.setText("");
                    //ama2.setText("");
                } else if (!(dpa1.getX() == 432 && dpa1.getY() == 432)) {
                    suma = Integer.parseInt(ama1.getText()) + Integer.parseInt(ama2.getText());
                    int a = servicio1.posficha(dpa1);
                    servicio1.Recorrido(dpa1, suma + a);
                    posIgualAm();
                    //ama1.setText("");
                    //ama2.setText("");
                }

            }
        };
        dpa1.addActionListener(muevea1);

        ActionListener muevea2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpa2.getX() == 482 && dpa2.getY() == 432 && ama1.getText().equals(ama2.getText())) {
                    servicio2.Recorrido(dpa2, 0);
                    ama1.setText("");
                    ama2.setText("");
                } else if (!(dpa2.getX() == 482 && dpa2.getY() == 432)) {
                    suma = Integer.parseInt(ama1.getText()) + Integer.parseInt(ama2.getText());
                    int a = servicio2.posficha(dpa2);
                    servicio2.Recorrido(dpa2, suma + a);
                    ama1.setText("");
                    ama2.setText("");
                    posIgualAm();
                }
            }
        };
        dpa2.addActionListener(muevea2);

        ActionListener muevea3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpa3.getX() == 432 && dpa3.getY() == 482 && ama1.getText().equals(ama2.getText())) {
                    servicio3.Recorrido(dpa3, 0);
                    ama1.setText("");
                    ama2.setText("");
                } else if (!(dpa3.getX() == 432 && dpa3.getY() == 482)) {
                    suma = Integer.parseInt(ama1.getText()) + Integer.parseInt(ama2.getText());
                    int a = servicio3.posficha(dpa3);
                    servicio3.Recorrido(dpa3, suma + a);
                    ama1.setText("");
                    ama2.setText("");
                    posIgualAm();
                }

            }
        };
        dpa3.addActionListener(muevea3);

        ActionListener muevea4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpa4.getX() == 482 && dpa4.getY() == 482 && ama1.getText().equals(ama2.getText())) {
                    servicio4.Recorrido(dpa4, 0);
                    ama1.setText("");
                    ama2.setText("");
                } else if (!(dpa3.getX() == 432 && dpa3.getY() == 482)) {
                    suma = Integer.parseInt(ama1.getText()) + Integer.parseInt(ama2.getText());
                    int a = servicio4.posficha(dpa4);
                    servicio4.Recorrido(dpa4, suma + a);
                    ama1.setText("");
                    ama2.setText("");
                    posIgualAm();
                }
            }
        };
        dpa4.addActionListener(muevea4);

    }

    private void MueveAzul(Fichas fich) {
        ServicioFichas servicio1 = fich.CrearFicha(1, dpaz1, 0);
        ServicioFichas servicio2 = fich.CrearFicha(2, dpaz2, 0);
        ServicioFichas servicio3 = fich.CrearFicha(3, dpaz3, 0);
        ServicioFichas servicio4 = fich.CrearFicha(4, dpaz4, 0);

        ActionListener muevea1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpaz1.getX() == 432 && dpaz1.getY() == 53 && az1.getText().equals(az2.getText())) {
                    servicio1.Recorrido(dpaz1, 0);
                    az1.setText("");
                    az2.setText("");
                } else if (!(dpaz1.getX() == 432 && dpaz1.getY() == 53)) {
                    suma = Integer.parseInt(az1.getText()) + Integer.parseInt(az2.getText());
                    int a = servicio1.posficha(dpaz1);
                    servicio1.Recorrido(dpaz1, suma + a);
                    az1.setText("");
                    az2.setText("");
                    posIgualAz();
                }
            }
        };
        dpaz1.addActionListener(muevea1);

        ActionListener muevea2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpaz2.getX() == 482 && dpaz2.getY() == 53 && az1.getText().equals(az2.getText())) {
                    servicio2.Recorrido(dpaz2, 0);
                    az1.setText("");
                    az2.setText("");
                } else if (!(dpaz2.getX() == 482 && dpaz2.getY() == 53)) {
                    suma = Integer.parseInt(az1.getText()) + Integer.parseInt(az2.getText());
                    int a = servicio2.posficha(dpaz2);
                    servicio2.Recorrido(dpaz2, suma + a);
                    az1.setText("");
                    az2.setText("");
                    posIgualAz();
                }
            }
        };
        dpaz2.addActionListener(muevea2);

        ActionListener muevea3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpaz3.getX() == 432 && dpaz3.getY() == 103 && az1.getText().equals(az2.getText())) {
                    servicio3.Recorrido(dpaz3, 0);
                    az1.setText("");
                    az2.setText("");
                } else if (!(dpaz3.getX() == 432 && dpaz3.getY() == 103)) {
                    suma = Integer.parseInt(az1.getText()) + Integer.parseInt(az2.getText());
                    int a = servicio3.posficha(dpaz3);
                    servicio3.Recorrido(dpaz3, suma + a);
                    az1.setText("");
                    az2.setText("");
                    posIgualAz();
                }
            }
        };
        dpaz3.addActionListener(muevea3);

        ActionListener muevea4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpaz4.getX() == 482 && dpaz4.getY() == 103 && az1.getText().equals(az2.getText())) {
                    servicio4.Recorrido(dpaz4, 0);
                    az1.setText("");
                    az2.setText("");
                } else if (!(dpaz3.getX() == 432 && dpaz3.getY() == 103)) {
                    suma = Integer.parseInt(az1.getText()) + Integer.parseInt(az2.getText());
                    int a = servicio4.posficha(dpaz4);
                    servicio4.Recorrido(dpaz4, suma + a);
                    az1.setText("");
                    az2.setText("");
                    posIgualAz();
                }
            }
        };
        dpaz4.addActionListener(muevea4);

    }

    private void MueveRojo(Fichas fich) {
        ServicioFichas servicio1 = fich.CrearFicha(1, dpr1, 0);
        ServicioFichas servicio2 = fich.CrearFicha(2, dpr2, 0);
        ServicioFichas servicio3 = fich.CrearFicha(3, dpr3, 0);
        ServicioFichas servicio4 = fich.CrearFicha(4, dpr4, 0);

        ActionListener muevea1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpr1.getX() == 53 && dpr1.getY() == 53 && ro1.getText().equals(ro2.getText())) {
                    servicio1.Recorrido(dpr1, 0);
                    ro1.setText("");
                    ro2.setText("");
                } else if (!(dpr1.getX() == 53 && dpr1.getY() == 53)) {
                    suma = Integer.parseInt(ro1.getText()) + Integer.parseInt(ro2.getText());
                    int a = servicio1.posficha(dpr1);
                    servicio1.Recorrido(dpr1, suma + a);
                    ro1.setText("");
                    ro2.setText("");
                    posIgualRo();
                }
            }
        };
        dpr1.addActionListener(muevea1);

        ActionListener muevea2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpr2.getX() == 103 && dpr2.getY() == 53 && ro1.getText().equals(ro2.getText())) {
                    servicio2.Recorrido(dpr2, 0);
                    ro1.setText("");
                    ro2.setText("");
                } else if (!(dpr2.getX() == 103 && dpr2.getY() == 53)) {
                    suma = Integer.parseInt(ro1.getText()) + Integer.parseInt(ro2.getText());
                    int a = servicio2.posficha(dpr2);
                    servicio2.Recorrido(dpr2, suma + a);
                    ro1.setText("");
                    ro2.setText("");
                    posIgualRo();
                }
            }
        };
        dpr2.addActionListener(muevea2);

        ActionListener muevea3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpr3.getX() == 53 && dpr3.getY() == 103 && ro1.getText().equals(ro2.getText())) {
                    servicio3.Recorrido(dpr3, 0);
                    ro1.setText("");
                    ro2.setText("");
                } else if (!(dpr3.getX() == 53 && dpr3.getY() == 103)) {
                    suma = Integer.parseInt(ro1.getText()) + Integer.parseInt(ro2.getText());
                    int a = servicio3.posficha(dpr3);
                    servicio3.Recorrido(dpr3, suma + a);
                    ro1.setText("");
                    ro2.setText("");
                    posIgualRo();
                }
            }
        };
        dpr3.addActionListener(muevea3);

        ActionListener muevea4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpr4.getX() == 103 && dpr4.getY() == 103 && ro1.getText().equals(ro2.getText())) {
                    servicio4.Recorrido(dpr4, 0);
                    ro1.setText("");
                    ro2.setText("");
                } else if (!(dpr4.getX() == 103 && dpr4.getY() == 103)) {
                    suma = Integer.parseInt(ro1.getText()) + Integer.parseInt(ro2.getText());
                    int a = servicio4.posficha(dpr4);
                    servicio4.Recorrido(dpr4, suma + a);
                    ro1.setText("");
                    ro2.setText("");
                    posIgualRo();
                }
            }
        };
        dpr4.addActionListener(muevea4);

    }

    private void MueveVerde(Fichas fich) {
        ServicioFichas servicio1 = fich.CrearFicha(1, dpv1, 0);
        ServicioFichas servicio2 = fich.CrearFicha(2, dpv2, 0);
        ServicioFichas servicio3 = fich.CrearFicha(3, dpv3, 0);
        ServicioFichas servicio4 = fich.CrearFicha(4, dpv4, 0);

        ActionListener muevea1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpv1.getX() == 53 && dpv1.getY() == 432 && ver1.getText().equals(ver2.getText())) {
                    servicio1.Recorrido(dpv1, 0);
                    ver1.setText("");
                    ver2.setText("");
                } else if (!(dpv1.getX() == 53 && dpv1.getY() == 432)) {
                    suma = Integer.parseInt(ver1.getText()) + Integer.parseInt(ver2.getText());
                    int a = servicio1.posficha(dpv1);
                    servicio1.Recorrido(dpv1, suma + a);
                    ver1.setText("");
                    ver2.setText("");
                    posIgualVer();
                }
            }
        };
        dpv1.addActionListener(muevea1);

        ActionListener muevea2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpv2.getX() == 103 && dpv2.getY() == 432 && ver1.getText().equals(ver2.getText())) {
                    servicio2.Recorrido(dpv2, 0);
                    ver1.setText("");
                    ver2.setText("");
                } else if (!(dpv1.getX() == 53 && dpv1.getY() == 432)) {
                    suma = Integer.parseInt(ver1.getText()) + Integer.parseInt(ver2.getText());
                    int a = servicio2.posficha(dpv2);
                    servicio2.Recorrido(dpv2, suma + a);
                    ver1.setText("");
                    ver2.setText("");
                    posIgualVer();
                }
            }
        };
        dpv2.addActionListener(muevea2);

        ActionListener muevea3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpv3.getX() == 53 && dpv3.getY() == 482 && ver1.getText().equals(ver2.getText())) {
                    servicio3.Recorrido(dpv3, 0);
                    ver1.setText("");
                    ver2.setText("");
                } else if (!(dpv1.getX() == 53 && dpv1.getY() == 432)) {
                    suma = Integer.parseInt(ver1.getText()) + Integer.parseInt(ver2.getText());
                    int a = servicio3.posficha(dpv3);
                    servicio3.Recorrido(dpv3, suma + a);
                    ver1.setText("");
                    ver2.setText("");
                    posIgualVer();
                }
            }
        };
        dpv3.addActionListener(muevea3);

        ActionListener muevea4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dpv4.getX() == 103 && dpv4.getY() == 482 && ver1.getText().equals(ver2.getText())) {
                    servicio4.Recorrido(dpv4, 0);
                    ver1.setText("");
                    ver2.setText("");
                } else if (!(dpv1.getX() == 53 && dpv1.getY() == 432)) {
                    suma = Integer.parseInt(ver1.getText()) + Integer.parseInt(ver2.getText());
                    int a = servicio4.posficha(dpv4);
                    servicio4.Recorrido(dpv4, suma + a);
                    ver1.setText("");
                    ver2.setText("");
                    posIgualVer();
                }
            }
        };
        dpv4.addActionListener(muevea4);

    }

    private void posIgualAm() {
        boolean bool = true;
        if (dpa1.getX() == dpaz1.getX() && dpa1.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpaz1, 432, 53, bool);
        }
        if (dpa1.getX() == dpaz2.getX() && dpa1.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpaz2, 482, 53, bool);
        }
        if (dpa1.getX() == dpaz3.getX() && dpa1.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpaz3, 432, 103, bool);
        }
        if (dpa1.getX() == dpaz4.getX() && dpa1.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpaz4, 482, 103, bool);
        }
        if (dpa2.getX() == dpaz1.getX() && dpa2.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpaz1, 432, 53, bool);
        }
        if (dpa2.getX() == dpaz2.getX() && dpa2.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpaz2, 482, 53, bool);
        }
        if (dpa2.getX() == dpaz3.getX() && dpa2.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpaz3, 432, 103, bool);
        }
        if (dpa2.getX() == dpaz4.getX() && dpa2.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpaz4, 432, 53, bool);
        }
        if (dpa3.getX() == dpaz1.getX() && dpa3.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpaz1, 432, 53, bool);
        }
        if (dpa3.getX() == dpaz2.getX() && dpa3.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpaz2, 432, 53, bool);
        }
        if (dpa3.getX() == dpaz3.getX() && dpa3.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpaz3, 432, 53, bool);
        }
        if (dpa3.getX() == dpaz4.getX() && dpa3.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpaz4, 432, 53, bool);
        }
        if (dpa4.getX() == dpaz1.getX() && dpa4.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpaz1, 432, 53, bool);
        }
        if (dpa4.getX() == dpaz2.getX() && dpa4.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpaz2, 432, 53, bool);
        }
        if (dpa4.getX() == dpaz3.getX() && dpa4.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpaz3, 432, 53, bool);
        }
        if (dpa4.getX() == dpaz4.getX() && dpa4.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpaz4, 432, 53, bool);
        }
        //////////////////////////////////////////////////////////////////////////
        if (dpa1.getX() == dpv1.getX() && dpa1.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpv1, 432, 53, bool);
        }
        if (dpa1.getX() == dpv2.getX() && dpa1.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpv2, 432, 53, bool);
        }
        if (dpa1.getX() == dpv3.getX() && dpa1.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpv3, 432, 53, bool);
        }
        if (dpa1.getX() == dpv4.getX() && dpa1.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpv4, 432, 53, bool);
        }
        if (dpa2.getX() == dpv1.getX() && dpa2.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpv1, 432, 53, bool);
        }
        if (dpa2.getX() == dpv2.getX() && dpa2.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpv2, 432, 53, bool);
        }
        if (dpa2.getX() == dpv3.getX() && dpa2.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpv3, 432, 53, bool);
        }
        if (dpa2.getX() == dpv4.getX() && dpa2.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpv4, 432, 53, bool);
        }
        if (dpa3.getX() == dpv1.getX() && dpa3.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpv1, 432, 53, bool);
        }
        if (dpa3.getX() == dpv2.getX() && dpa3.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpv2, 432, 53, bool);
        }
        if (dpa3.getX() == dpv3.getX() && dpa3.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpv3, 432, 53, bool);
        }
        if (dpa3.getX() == dpv4.getX() && dpa3.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpv4, 432, 53, bool);
        }
        if (dpa4.getX() == dpv1.getX() && dpa4.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpv1, 432, 53, bool);
        }
        if (dpa4.getX() == dpv2.getX() && dpa4.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpv2, 432, 53, bool);
        }
        if (dpa4.getX() == dpv3.getX() && dpa4.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpv3, 432, 53, bool);
        }
        if (dpa4.getX() == dpv4.getX() && dpa4.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpv4, 432, 53, bool);
        }
        if (dpa1.getX() == dpr1.getX() && dpa1.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpr1, 432, 53, bool);
        }
        if (dpa1.getX() == dpr2.getX() && dpa1.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpr2, 432, 53, bool);
        }
        if (dpa1.getX() == dpr3.getX() && dpa1.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpr3, 432, 53, bool);
        }
        if (dpa1.getX() == dpr4.getX() && dpa1.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa1, dpr4, 432, 53, bool);
        }
        if (dpa2.getX() == dpr1.getX() && dpa2.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpr1, 432, 53, bool);
        }
        if (dpa2.getX() == dpr2.getX() && dpa2.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpr2, 432, 53, bool);
        }
        if (dpa2.getX() == dpr3.getX() && dpa2.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpr3, 432, 53, bool);
        }
        if (dpa2.getX() == dpr4.getX() && dpa2.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa2, dpr4, 432, 53, bool);
        }
        if (dpa3.getX() == dpaz1.getX() && dpa3.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpaz1, 432, 53, bool);
        }
        if (dpa3.getX() == dpr2.getX() && dpa3.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpr2, 432, 53, bool);
        }
        if (dpa3.getX() == dpr3.getX() && dpa3.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpr3, 432, 53, bool);
        }
        if (dpa3.getX() == dpr4.getX() && dpa3.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa3, dpr4, 432, 53, bool);
        }
        if (dpa4.getX() == dpr1.getX() && dpa4.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpr1, 432, 53, bool);
        }
        if (dpa4.getX() == dpr2.getX() && dpa4.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpr2, 432, 53, bool);
        }
        if (dpa4.getX() == dpr3.getX() && dpa4.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpr3, 432, 53, bool);
        }
        if (dpa4.getX() == dpr4.getX() && dpa4.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpa4, dpr4, 432, 53, bool);
        }

    }

    private void posIgualAz() {
        boolean bool = true;
        if (dpaz1.getX() == dpa1.getX() && dpaz1.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpa1, 432, 53, bool);
        }
        if (dpaz1.getX() == dpa2.getX() && dpaz1.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpa2, 432, 53, bool);
        }
        if (dpaz1.getX() == dpa3.getX() && dpaz1.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpa3, 432, 53, bool);
        }
        if (dpaz1.getX() == dpa4.getX() && dpaz1.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpa4, 432, 53, bool);
        }
        if (dpaz2.getX() == dpa1.getX() && dpaz2.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpa1, 432, 53, bool);
        }
        if (dpaz2.getX() == dpa2.getX() && dpaz2.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpa2, 432, 53, bool);
        }
        if (dpaz2.getX() == dpa3.getX() && dpaz2.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpa3, 432, 53, bool);
        }
        if (dpaz2.getX() == dpa4.getX() && dpaz2.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpa4, 432, 53, bool);
        }
        if (dpaz3.getX() == dpa1.getX() && dpaz3.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpa1, 432, 53, bool);
        }
        if (dpaz3.getX() == dpa2.getX() && dpaz3.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpa2, 432, 53, bool);
        }
        if (dpaz3.getX() == dpa3.getX() && dpaz3.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpa3, 432, 53, bool);
        }
        if (dpaz3.getX() == dpa4.getX() && dpaz3.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpa4, 432, 53, bool);
        }
        if (dpaz4.getX() == dpa1.getX() && dpaz4.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpa1, 432, 53, bool);
        }
        if (dpaz4.getX() == dpa2.getX() && dpaz4.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpa2, 432, 53, bool);
        }
        if (dpaz4.getX() == dpa3.getX() && dpaz4.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpa3, 432, 53, bool);
        }
        if (dpaz4.getX() == dpa4.getX() && dpaz4.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpa4, 432, 53, bool);
        }
        //////////////////////////////////////////////////////////////////////////
        if (dpaz1.getX() == dpv1.getX() && dpaz1.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpv1, 432, 53, bool);
        }
        if (dpaz1.getX() == dpv2.getX() && dpaz1.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpv2, 432, 53, bool);
        }
        if (dpaz1.getX() == dpv3.getX() && dpaz1.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpv3, 432, 53, bool);
        }
        if (dpaz1.getX() == dpv4.getX() && dpaz1.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpv4, 432, 53, bool);
        }
        if (dpaz2.getX() == dpv1.getX() && dpaz2.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpv1, 432, 53, bool);
        }
        if (dpaz2.getX() == dpv2.getX() && dpaz2.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpv2, 432, 53, bool);
        }
        if (dpaz2.getX() == dpv3.getX() && dpaz2.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpv3, 432, 53, bool);
        }
        if (dpaz2.getX() == dpv4.getX() && dpaz2.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpv4, 432, 53, bool);
        }
        if (dpaz3.getX() == dpv1.getX() && dpaz3.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpv1, 432, 53, bool);
        }
        if (dpaz3.getX() == dpv2.getX() && dpaz3.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpv2, 432, 53, bool);
        }
        if (dpaz3.getX() == dpv3.getX() && dpaz3.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpv3, 432, 53, bool);
        }
        if (dpaz3.getX() == dpv4.getX() && dpaz3.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpv4, 432, 53, bool);
        }
        if (dpaz4.getX() == dpv1.getX() && dpaz4.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpv1, 432, 53, bool);
        }
        if (dpaz4.getX() == dpv2.getX() && dpaz4.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpv2, 432, 53, bool);
        }
        if (dpaz4.getX() == dpv3.getX() && dpaz4.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpv3, 432, 53, bool);
        }
        if (dpaz4.getX() == dpv4.getX() && dpaz4.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpv4, 432, 53, bool);
        }
        if (dpaz1.getX() == dpr1.getX() && dpaz1.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpr1, 432, 53, bool);
        }
        if (dpaz1.getX() == dpr2.getX() && dpaz1.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpr2, 432, 53, bool);
        }
        if (dpaz1.getX() == dpr3.getX() && dpaz1.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpr3, 432, 53, bool);
        }
        if (dpaz1.getX() == dpr4.getX() && dpaz1.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz1, dpr4, 432, 53, bool);
        }
        if (dpaz2.getX() == dpr1.getX() && dpaz2.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpr1, 432, 53, bool);
        }
        if (dpaz2.getX() == dpr2.getX() && dpaz2.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpr2, 432, 53, bool);
        }
        if (dpaz2.getX() == dpr3.getX() && dpaz2.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpr3, 432, 53, bool);
        }
        if (dpaz2.getX() == dpr4.getX() && dpaz2.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz2, dpr4, 432, 53, bool);
        }
        if (dpaz3.getX() == dpaz1.getX() && dpaz3.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpaz1, 432, 53, bool);
        }
        if (dpaz3.getX() == dpr2.getX() && dpaz3.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpr2, 432, 53, bool);
        }
        if (dpaz3.getX() == dpr3.getX() && dpaz3.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpr3, 432, 53, bool);
        }
        if (dpaz3.getX() == dpr4.getX() && dpaz3.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz3, dpr4, 432, 53, bool);
        }
        if (dpaz4.getX() == dpr1.getX() && dpaz4.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpr1, 432, 53, bool);
        }
        if (dpaz4.getX() == dpr2.getX() && dpaz4.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpr2, 432, 53, bool);
        }
        if (dpaz4.getX() == dpr3.getX() && dpaz4.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpr3, 432, 53, bool);
        }
        if (dpaz4.getX() == dpr4.getX() && dpaz4.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpaz4, dpr4, 432, 53, bool);
        }

    }

    private void posIgualRo() {
        boolean bool = true;
        if (dpr1.getX() == dpaz1.getX() && dpr1.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpaz1, 432, 53, bool);
        }
        if (dpr1.getX() == dpaz2.getX() && dpr1.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpaz2, 432, 53, bool);
        }
        if (dpr1.getX() == dpaz3.getX() && dpr1.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpaz3, 432, 53, bool);
        }
        if (dpr1.getX() == dpaz4.getX() && dpr1.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpaz4, 432, 53, bool);
        }
        if (dpr2.getX() == dpaz1.getX() && dpr2.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpaz1, 432, 53, bool);
        }
        if (dpr2.getX() == dpaz2.getX() && dpr2.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpaz2, 432, 53, bool);
        }
        if (dpr2.getX() == dpaz3.getX() && dpr2.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpaz3, 432, 53, bool);
        }
        if (dpr2.getX() == dpaz4.getX() && dpr2.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpaz4, 432, 53, bool);
        }
        if (dpr3.getX() == dpaz1.getX() && dpr3.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpaz1, 432, 53, bool);
        }
        if (dpr3.getX() == dpaz2.getX() && dpr3.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpaz2, 432, 53, bool);
        }
        if (dpr3.getX() == dpaz3.getX() && dpr3.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpaz3, 432, 53, bool);
        }
        if (dpr3.getX() == dpaz4.getX() && dpr3.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpaz4, 432, 53, bool);
        }
        if (dpr4.getX() == dpaz1.getX() && dpr4.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpaz1, 432, 53, bool);
        }
        if (dpr4.getX() == dpaz2.getX() && dpr4.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpaz2, 432, 53, bool);
        }
        if (dpr4.getX() == dpaz3.getX() && dpr4.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpaz3, 432, 53, bool);
        }
        if (dpr4.getX() == dpaz4.getX() && dpr4.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpaz4, 432, 53, bool);
        }
        //////////////////////////////////////////////////////////////////////////
        if (dpr1.getX() == dpv1.getX() && dpr1.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpv1, 432, 53, bool);
        }
        if (dpr1.getX() == dpv2.getX() && dpr1.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpv2, 432, 53, bool);
        }
        if (dpr1.getX() == dpv3.getX() && dpr1.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpv3, 432, 53, bool);
        }
        if (dpr1.getX() == dpv4.getX() && dpr1.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpv4, 432, 53, bool);
        }
        if (dpr2.getX() == dpv1.getX() && dpr2.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpv1, 432, 53, bool);
        }
        if (dpr2.getX() == dpv2.getX() && dpr2.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpv2, 432, 53, bool);
        }
        if (dpr2.getX() == dpv3.getX() && dpr2.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpv3, 432, 53, bool);
        }
        if (dpr2.getX() == dpv4.getX() && dpr2.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpv4, 432, 53, bool);
        }
        if (dpr3.getX() == dpv1.getX() && dpr3.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpv1, 432, 53, bool);
        }
        if (dpr3.getX() == dpv2.getX() && dpr3.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpv2, 432, 53, bool);
        }
        if (dpr3.getX() == dpv3.getX() && dpr3.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpv3, 432, 53, bool);
        }
        if (dpr3.getX() == dpv4.getX() && dpr3.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpv4, 432, 53, bool);
        }
        if (dpr4.getX() == dpv1.getX() && dpr4.getY() == dpv1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpv1, 432, 53, bool);
        }
        if (dpr4.getX() == dpv2.getX() && dpr4.getY() == dpv2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpv2, 432, 53, bool);
        }
        if (dpr4.getX() == dpv3.getX() && dpr4.getY() == dpv3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpv3, 432, 53, bool);
        }
        if (dpr4.getX() == dpv4.getX() && dpr4.getY() == dpv4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpv4, 432, 53, bool);
        }
        if (dpr1.getX() == dpa1.getX() && dpr1.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpa1, 432, 53, bool);
        }
        if (dpr1.getX() == dpa2.getX() && dpr1.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpa2, 432, 53, bool);
        }
        if (dpr1.getX() == dpa3.getX() && dpr1.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpa3, 432, 53, bool);
        }
        if (dpr1.getX() == dpa4.getX() && dpr1.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr1, dpa4, 432, 53, bool);
        }
        if (dpr2.getX() == dpa1.getX() && dpr2.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpa1, 432, 53, bool);
        }
        if (dpr2.getX() == dpa2.getX() && dpr2.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpa2, 432, 53, bool);
        }
        if (dpr2.getX() == dpa3.getX() && dpr2.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpa3, 432, 53, bool);
        }
        if (dpr2.getX() == dpa4.getX() && dpr2.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr2, dpa4, 432, 53, bool);
        }
        if (dpr3.getX() == dpa1.getX() && dpr3.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpa1, 432, 53, bool);
        }
        if (dpr3.getX() == dpa2.getX() && dpr3.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpa2, 432, 53, bool);
        }
        if (dpr3.getX() == dpa3.getX() && dpr3.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpa3, 432, 53, bool);
        }
        if (dpr3.getX() == dpa4.getX() && dpr3.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr3, dpa4, 432, 53, bool);
        }
        if (dpr4.getX() == dpa1.getX() && dpr4.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpa1, 432, 53, bool);
        }
        if (dpr4.getX() == dpa2.getX() && dpr4.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpa2, 432, 53, bool);
        }
        if (dpr4.getX() == dpa3.getX() && dpr4.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpa3, 432, 53, bool);
        }
        if (dpr4.getX() == dpa4.getX() && dpr4.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpr4, dpa4, 432, 53, bool);
        }

    }
        private void posIgualVer() {
        boolean bool = true;
        if (dpv1.getX() == dpaz1.getX() && dpv1.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpaz1, 432, 53, bool);
        }
        if (dpv1.getX() == dpaz2.getX() && dpv1.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpaz2, 432, 53, bool);
        }
        if (dpv1.getX() == dpaz3.getX() && dpv1.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpaz3, 432, 53, bool);
        }
        if (dpv1.getX() == dpaz4.getX() && dpv1.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpaz4, 432, 53, bool);
        }
        if (dpv2.getX() == dpaz1.getX() && dpv2.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpaz1, 432, 53, bool);
        }
        if (dpv2.getX() == dpaz2.getX() && dpv2.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpaz2, 432, 53, bool);
        }
        if (dpv2.getX() == dpaz3.getX() && dpv2.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpaz3, 432, 53, bool);
        }
        if (dpv2.getX() == dpaz4.getX() && dpv2.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpaz4, 432, 53, bool);
        }
        if (dpv3.getX() == dpaz1.getX() && dpv3.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpaz1, 432, 53, bool);
        }
        if (dpv3.getX() == dpaz2.getX() && dpv3.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpaz2, 432, 53, bool);
        }
        if (dpv3.getX() == dpaz3.getX() && dpv3.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpaz3, 432, 53, bool);
        }
        if (dpv3.getX() == dpaz4.getX() && dpv3.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpaz4, 432, 53, bool);
        }
        if (dpv4.getX() == dpaz1.getX() && dpv4.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpaz1, 432, 53, bool);
        }
        if (dpv4.getX() == dpaz2.getX() && dpv4.getY() == dpaz2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpaz2, 432, 53, bool);
        }
        if (dpv4.getX() == dpaz3.getX() && dpv4.getY() == dpaz3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpaz3, 432, 53, bool);
        }
        if (dpv4.getX() == dpaz4.getX() && dpv4.getY() == dpaz4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpaz4, 432, 53, bool);
        }
        //////////////////////////////////////////////////////////////////////////
        if (dpv1.getX() == dpa1.getX() && dpv1.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpa1, 432, 53, bool);
        }
        if (dpv1.getX() == dpa2.getX() && dpv1.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpa2, 432, 53, bool);
        }
        if (dpv1.getX() == dpa3.getX() && dpv1.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpa3, 432, 53, bool);
        }
        if (dpv1.getX() == dpa4.getX() && dpv1.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpa4, 432, 53, bool);
        }
        if (dpv2.getX() == dpa1.getX() && dpv2.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpa1, 432, 53, bool);
        }
        if (dpv2.getX() == dpa2.getX() && dpv2.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpa2, 432, 53, bool);
        }
        if (dpv2.getX() == dpa3.getX() && dpv2.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpa3, 432, 53, bool);
        }
        if (dpv2.getX() == dpa4.getX() && dpv2.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpa4, 432, 53, bool);
        }
        if (dpv3.getX() == dpa1.getX() && dpv3.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpa1, 432, 53, bool);
        }
        if (dpv3.getX() == dpa2.getX() && dpv3.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpa2, 432, 53, bool);
        }
        if (dpv3.getX() == dpa3.getX() && dpv3.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpa3, 432, 53, bool);
        }
        if (dpv3.getX() == dpa4.getX() && dpv3.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpa4, 432, 53, bool);
        }
        if (dpv4.getX() == dpa1.getX() && dpv4.getY() == dpa1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpa1, 432, 53, bool);
        }
        if (dpv4.getX() == dpa2.getX() && dpv4.getY() == dpa2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpa2, 432, 53, bool);
        }
        if (dpv4.getX() == dpa3.getX() && dpv4.getY() == dpa3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpa3, 432, 53, bool);
        }
        if (dpv4.getX() == dpa4.getX() && dpv4.getY() == dpa4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpa4, 432, 53, bool);
        }
        if (dpv1.getX() == dpr1.getX() && dpv1.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpr1, 432, 53, bool);
        }
        if (dpv1.getX() == dpr2.getX() && dpv1.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpr2, 432, 53, bool);
        }
        if (dpv1.getX() == dpr3.getX() && dpv1.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpr3, 432, 53, bool);
        }
        if (dpv1.getX() == dpr4.getX() && dpv1.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv1, dpr4, 432, 53, bool);
        }
        if (dpv2.getX() == dpr1.getX() && dpv2.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpr1, 432, 53, bool);
        }
        if (dpv2.getX() == dpr2.getX() && dpv2.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpr2, 432, 53, bool);
        }
        if (dpv2.getX() == dpr3.getX() && dpv2.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpr3, 432, 53, bool);
        }
        if (dpv2.getX() == dpr4.getX() && dpv2.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv2, dpr4, 432, 53, bool);
        }
        if (dpv3.getX() == dpaz1.getX() && dpv3.getY() == dpaz1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpaz1, 432, 53, bool);
        }
        if (dpv3.getX() == dpr2.getX() && dpv3.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpr2, 432, 53, bool);
        }
        if (dpv3.getX() == dpr3.getX() && dpv3.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpr3, 432, 53, bool);
        }
        if (dpv3.getX() == dpr4.getX() && dpv3.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv3, dpr4, 432, 53, bool);
        }
        if (dpv4.getX() == dpr1.getX() && dpv4.getY() == dpr1.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpr1, 432, 53, bool);
        }
        if (dpv4.getX() == dpr2.getX() && dpv4.getY() == dpr2.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpr2, 432, 53, bool);
        }
        if (dpv4.getX() == dpr3.getX() && dpv4.getY() == dpr3.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpr3, 432, 53, bool);
        }
        if (dpv4.getX() == dpr4.getX() && dpv4.getY() == dpr4.getY()) {
            new FacadeMuerte().sinreporte(jugador1, dpv4, dpr4, 432, 53, bool);
        }

    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource(tab1.getruta())).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
