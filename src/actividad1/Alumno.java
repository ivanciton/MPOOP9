/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

/**
 *
 * @author ivan_
 */
public class Alumno extends Persona{
    private String carrera;
    private String semestre;

    public Alumno() {
    }

    public Alumno(String carrera, String semestre) {
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public void respirar() {
        System.out.println("respiro normal");
    }
    
    /**
     * Este metodo muestra que esta aprendiendo ingles
     * No retorna ningun valor
     * 
     */
    public void apreder(){
        System.out.println("estoy aprendiendo Ingles ");
    }
    /**
     * Este metodo muestra que esta estudiando una carrera
     * @param carrera el nombre de lo que esta estudiando
     * No retorna ningun valor
     */
    public void estudiar(String carrera){
        System.out.println("estoy estudiando "+carrera);
    }
    /**
     * Este metodo muestra que el alumno se dio de baja
     * No retorna ningun valor
     */
    public void darDeBaja(){
        System.out.println("Ya me di de baja");
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    

    
}
