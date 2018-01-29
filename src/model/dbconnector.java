/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ragasi92
 */
public class dbconnector {
    private final String url = "jdbc:mysql://localhost/prestamos";
    private final String user = "phpmyadmin";
    private final String passw = "rafaja77";
    private Statement estado;

    public dbconnector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conection = DriverManager.getConnection(url, user, passw);
            System.out.println("conexion exitosa");
            estado = conection.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    public ArrayList<Alumno> obtenerAlumnos(){
            ResultSet alumnos;
            ArrayList<Alumno> resultados = new ArrayList<>();
            try{
            
            alumnos = estado.executeQuery("select * from alumnos");
            while(alumnos.next()){
                resultados.add(new Alumno(alumnos.getInt("alumno_matricula"),
                      alumnos.getString("alumno_nombre"),
                      alumnos.getString("alumno_apellidop"),
                     alumnos.getString("alumno_apellidom"),
                     alumnos.getString("alumno_carrera")));
            }
            }
            catch(Exception e){
                System.out.println(e);
                alumnos = null;
            }
            return resultados;
        }
    
}
    

