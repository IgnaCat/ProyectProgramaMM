/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamamm;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ignacio
 */
public class NuevoCliente {
    
    private JFrame frame2;
    
    public NuevoCliente(){
        
        frame2 = new JFrame(" Nuevo Cliente");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(800, 600);
        frame2.getContentPane().setBackground(Color.lightGray);
        frame2.setResizable(false);

        frame2.setLayout(null);
        
        
        
        
        
        frame2.setVisible(
                true);
    }
    
 
    public void setVisible(boolean b){
        frame2.setVisible(b);
    }
    
}
