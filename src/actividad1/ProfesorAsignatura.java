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
public class ProfesorAsignatura extends Profesor {
    private String nombreAsignatura;
    private int grupos;

    public ProfesorAsignatura() {
    }

    public ProfesorAsignatura(String nombreAsignatura, int grupos) {
        this.nombreAsignatura = nombreAsignatura;
        this.grupos = grupos;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    @Override
    public void reprobar() {
        System.out.println("presentaa extra!!!!");
    }

    @Override
    public void pasarAlumno() {
        System.out.println("Estas exento de la materia");
    }

    @Override
    public void explicar() {
        System.out.println("vamos a explicar paso por paso");
    }

    @Override
    public void aclararDudas() {
        System.out.println("¿Que duda tienes?");
    }

    @Override
    public void respirar() {
        System.out.println("Estoy respirando");
    }

    @Override
    public String toString() {
        return super.toString()+"ProfesorAsignatura{" + "nombreAsignatura=" + nombreAsignatura + ", grupos=" + grupos + '}';
    }
    
}
