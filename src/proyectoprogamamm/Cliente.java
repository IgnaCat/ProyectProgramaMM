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
public class Cliente {
    
    private JFrame frame1;
    
    public Cliente() {
        frame1 = new JFrame("Cliente M&M");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1400, 800);
        frame1.getContentPane().setBackground(Color.lightGray);
        frame1.setResizable(false);

        frame1.setLayout(null);
        

        
        
        frame1.setVisible(
                true);
    }
    

}
