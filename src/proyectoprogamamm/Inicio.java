/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamamm;

/**
 *
 * @author ignacio
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import proyectoprogamamm.VentanaTablaClientes ;
import proyectoprogamamm.VentanaTablaProfesor;



public class Inicio {

    private JFrame frame;
    private JTabbedPane pane;
    private ImageIcon ii;
    private JLabel lable;
    public Inicio() {   
        frame = new JFrame("M&M Gym");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 800);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setResizable(false);
        

        frame.setLayout(null);

        pane = new JTabbedPane();
        pane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        ii = new ImageIcon("Imagen/gym.png");
        lable = new JLabel(ii);
        lable.setBounds(0, 0, 1400, 800);

        JButton btnCliente = new JButton("Cliente");
        btnCliente.setBounds(200, 250, 180, 40);

        JButton btnProfesor = new JButton("Profesor");
        btnProfesor.setBounds(200, 350, 180, 40);

        btnCliente.addActionListener(
                (ActionEvent e) -> {
                   VentanaTablaClientes cliente = new VentanaTablaClientes();
                   cliente.importar();
                    frame.setVisible(false);
                }
        );
        
         btnProfesor.addActionListener(
                (ActionEvent e) -> {
//                    cliente.setVisible(true);
                    VentanaTablaProfesor profesor = new VentanaTablaProfesor();
                    frame.setVisible(false);
                }
        );

        frame.add(pane);
        frame.add(btnProfesor);
        frame.add(btnCliente);
        frame.add(lable);

        frame.setVisible(
                true);
//        cliente.setVisible(false);
//        mm.cerrarCliente();


    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}


