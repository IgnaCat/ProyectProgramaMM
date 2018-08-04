
package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class ProyectoProgramaMM {
    
    private JFrame frame;
    private JTabbedPane pane;
    private ImageIcon ii;
    private JLabel lable;

    
    private static Cliente c = new Cliente();
    
    public ProyectoProgramaMM(){
               
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

        JButton btnClases = new JButton("Clases");
        btnClases.setBounds(200, 450, 180, 40);
        
        btnCliente.addActionListener(
                (ActionEvent e) -> {
                    c.setVisible(true);
                    frame.setVisible(false);
                }
        );

        frame.add(pane);
        frame.add(btnClases);
        frame.add(btnProfesor);
        frame.add(btnCliente);
        frame.add(lable);
         
   
        frame.setVisible(
                true);
        
    }
    
    public void setVisible(boolean b){
        frame.setVisible(b);
    }
    
   
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectoProgramaMM MM = new ProyectoProgramaMM();


    }
    
}
