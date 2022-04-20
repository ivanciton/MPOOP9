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
public class Gato extends Mascota {

    public Gato(){
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando con mi bolita");
    }

    @Override
    public void saltar() {
        System.out.println("Estoy trepando un arbol");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo en mi colcha");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro lento");
    }

    /**
     * Este metodo dice que el gato esta rasguñando 
     * No retorna ningun valor
     */
    public void rasguniar(){
        System.out.println("rasguñando");
        
    }
    /**
     * Este metodo muestra que el gato esta trepando
     * No retorno ningun valor
     */
    public void trepar(){
        System.out.println("estoy trepando");
    }

    @Override
    public String toString() {
        return super.toString()+"Gato{" + '}';
    }
}
