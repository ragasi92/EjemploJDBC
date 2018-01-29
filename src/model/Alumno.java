/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ragasi92
 */
public class Alumno {
    private int matricula;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private String carrera;
    
    public Alumno(int mat, String nombre, String apep, String apem, String carrera){
        matricula= mat;
        this. nombre = nombre;
        apellidop = apep;
        apellidom = apem;
        this.carrera = carrera;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidop
     */
    public String getApellidop() {
        return apellidop;
    }

    /**
     * @param apellidop the apellidop to set
     */
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    /**
     * @return the apellidom
     */
    public String getApellidom() {
        return apellidom;
    }

    /**
     * @param apellidom the apellidom to set
     */
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
