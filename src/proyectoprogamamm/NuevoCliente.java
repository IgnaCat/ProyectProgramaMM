
package proyectoprogamamm;

import java.awt.Color;
import javax.swing.JFrame;


public class NuevoCliente {
    
    private JFrame frame2;
    
    public NuevoCliente(){
        
        frame2 = new JFrame(" Nuevo Cliente");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
