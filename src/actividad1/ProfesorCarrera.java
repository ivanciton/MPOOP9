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
public class ProfesorCarrera extends Profesor {
    private int numAsignatura;

    public ProfesorCarrera() {
    }

    public ProfesorCarrera(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    @Override
    public String toString() {
        return super.toString()+"ProfesorCarrera{" + "numAsignatura=" + numAsignatura + '}';
    }

    @Override
    public void reprobar() {
        System.out.println("No pasas ni con un 6");
    }

    @Override
    public void pasarAlumno() {
        System.out.println("Sacas una buena nota");
    }

    @Override
    public void explicar() {
        System.out.println("¿De que materia quieres que te ayude?");
    }

    @Override
    public void aclararDudas() {
        System.out.println("Cual es tu duda de la materia?");
    }

    @Override
    public void respirar() {
        System.out.println("Estoy respirando");
    }
    
    
}
