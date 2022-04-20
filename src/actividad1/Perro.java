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
public class Perro extends Mascota {
    private boolean coloCortada;
    

    public Perro(boolean coloCortada) {
        this.coloCortada = coloCortada;
    }

    public Perro() {
    }
    
    
    @Override
    public void jugar() {
         System.out.println("Estoy jugando con mi hueso");
    }

    @Override
    public void saltar() {
        System.out.println("Estoy saltando por mi pelota");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo en mi casita");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro agitado");
    }
    /**
     * Este metodo muestra que el perro esta corriendo
     * No retorna ningun valor
     */
    public void correr(){
        System.out.println("Estoy corriendo con otro perro");
    }
    /**
     * Este metodo dice que el perro esta correteando 
     * No retorna ningun valor
     */
    public void corretear(){
        System.out.println("Estoy correteando al cartero");
    }
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "coloCortada=" + coloCortada + '}';
    }
    
    
}
