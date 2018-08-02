
package proyectoprogamamm;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ProyectoProgramaMM {
    
    private JFrame frame;

    
    public ProyectoProgramaMM(){
        frame = new JFrame("M&M Gym");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 800);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setResizable(false);

        frame.setLayout(null);
        
        ImageIcon ii = new ImageIcon("/home/ignacio/Escritorio/ProyectProgramaMM/Imagen/gym.png");
        JLabel lable = new JLabel(ii);
        lable.setBounds(0, 0, 1400, 800);
        
        JButton btnCliente = new JButton("Cliente");
        btnCliente.setBounds(200, 300, 180, 40);

        JButton btnClases = new JButton("Clases");
        btnClases.setBounds(200, 400, 180, 40);


        frame.add(btnClases);
        frame.add(btnCliente);
        frame.add(lable);

	 
   
        frame.setVisible(
                true);
        
    }
    
   
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectoProgramaMM MM = new ProyectoProgramaMM();


    }
    
}
