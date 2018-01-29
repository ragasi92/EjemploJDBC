/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Alumno;
import model.dbconnector;
import view.main;

/**
 *
 * @author ragasi92
 */
public class mainFrame implements ActionListener {
    private DefaultTableModel modelo;
    private String[] nombresTablaAlumnos = {"Matrícula","Nombre", "Carrera"};
    main ventana;
    dbconnector conector = new dbconnector();
    ArrayList<Alumno> alumnos = new ArrayList<>();
    public mainFrame(main vnt){
        ventana = vnt;
        ventana.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, 
                Toolkit.getDefaultToolkit().getScreenSize().width);
        //Se inicializa el modelo de la tabla de pedidos
        modelo = (DefaultTableModel)ventana.jTable1.getModel();
        //Identificadores de las columnas de la tabla
        modelo.setColumnIdentifiers(nombresTablaAlumnos);
        modelo.setNumRows(0);
        this.obtenerAlumnos();
        
    }
    
    
    public void botonConsulta(java.awt.event.ActionEvent evt){
        ventana.jLabel1.setText("hoal");
        System.out.println("precionaste boton");
        this.obtenerAlumnos();
    }
    
    private void obtenerAlumnos(){
        alumnos = conector.obtenerAlumnos();
        
        for(int i =0;i<alumnos.size();i++){
            String[] s= {String.valueOf(alumnos.get(i).getMatricula()),
            alumnos.get(i).getNombre()+" "+ alumnos.get(i).getApellidop() + " "+
                    alumnos.get(i).getApellidom(),alumnos.get(i).getCarrera()};
            modelo.addRow(s);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.ventana.btnConsulta == e.getSource()){
            System.out.println("Presionaste boton consulta");
            this.obtenerAlumnos();
        }else if(this.ventana.jButton1 == e.getSource()){
            System.out.println("Presionaste otro boton");
        }
    }
    
}
