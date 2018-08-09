/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogamamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Cliente {
    
    private JFrame frame1;
    private JTable table;
    private JScrollPane scroll;
    private JTextField textField;
    private DefaultTableModel model;
    
//    private static NuevoCliente nuevoCliente = new NuevoCliente();
    ProyectoProgramaMM mm = new ProyectoProgramaMM();
    
    public Cliente() {
        frame1 = new JFrame("Cliente");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1300, 800);
        frame1.getContentPane().setBackground(Color.lightGray);
        frame1.setResizable(false);

        frame1.setLayout(null);
        
//        Object columnNames[] = { "Numero", "Nombre", "Apellido", "DNI", "Fecha de Inicio", "Profesor","Direccion", "Telefono" };
//
//        
//        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "dcsds", "dfedfdd", "cgccfc", "uguvvih" ,"kjvfsjv" },};
//       
//        table = new JTable(rowData, columnNames);
        DefaultTableModel model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("Numero");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Fecha de Inicio");
        model.addColumn("Profesor");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        
//        model.addRow(new Object[]{"lol"});
        
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
        
        
        btnNuevoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //                    nuevoCliente.setVisible(true);
                mm.abrirNuevoCliente();
            }
        });
        
        
        frame1.add(btnNuevoCliente);
        frame1.add(btnActualizar);
        frame1.add(btnBuscar);
        frame1.add(textField);
        frame1.add(scroll);
        
        
        frame1.setVisible(
                true);
        
        
        
//        nuevoCliente.setVisible(false);
//        mm.cerrarNuevoCliente();
        
    }

    public JFrame getFrame1() {
        return frame1;
    }

    public JTable getTable() {
        return table;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public JTextField getTextField() {
        return textField;
    }
    
    public void setVisible(boolean b){
        frame1.setVisible(b);
    }
    

}
