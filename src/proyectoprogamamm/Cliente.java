/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Cliente {
    
    private JFrame frame1;
    private JTable table;
    private JScrollPane scroll;
    private JTextField textField;
    
//    private static NuevoCliente nuevoCliente = new NuevoCliente();
    
    public Cliente() {
        frame1 = new JFrame("Cliente");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1300, 800);
        frame1.getContentPane().setBackground(Color.lightGray);
        frame1.setResizable(false);

        frame1.setLayout(null);
        
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "dcsds", "dfedfdd", "cgccfc", "uguvvih" ,"kjvfsjv" },
                               { "Row2-Column1", "Row2-Column2", "Row2-Column3", "dcsds", "dfedfdd", "cgccfc", "uguvvih","ievbejrv"  } };
        
        Object columnNames[] = { "Numero", "Nombre", "Apellido", "DNI", "Fecha de Inicio", "Profesor","Direccion", "Telefono" };
        
        
        table = new JTable(rowData, columnNames);
        table.setFont(new java.awt.Font("Tahoma", 30, 15));
        table.setRowHeight(25);
//        table.getColumnModel().getColumn(0).setPreferredWidth(200);       

        scroll = new JScrollPane(table);
        scroll.setBounds(400, 25, 840, 700);
        
        textField = new JTextField();
        textField.setToolTipText("Escriba algo aqui");
        textField.setBounds(120, 60, 200, 35);
        
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(120, 105, 200, 30);
        
        JButton btnActualizar = new JButton("Actulizar Tabla");
        btnActualizar.setBounds(120, 150, 200, 30);
        
        JButton btnNuevoCliente = new JButton("Nuevo Cliente");
        btnNuevoCliente.setBounds(120, 220, 200, 30);
        
        
        btnNuevoCliente.addActionListener(
                (ActionEvent e) -> {
//                    nuevoCliente.setVisible(true);
                }
        );
        
        
        frame1.add(btnNuevoCliente);
        frame1.add(btnActualizar);
        frame1.add(btnBuscar);
        frame1.add(textField);
        frame1.add(scroll);
        
        
        frame1.setVisible(
                true);  
        
//        nuevoCliente.setVisible(false);
    }
    
    public void setVisible(boolean b){
        frame1.setVisible(b);
    }
    

}
