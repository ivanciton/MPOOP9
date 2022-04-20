/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

import actividad1.Alumno;
import actividad1.Gato;
import actividad1.Mesero;
import actividad1.Perro;
import actividad1.ProfesorAsignatura;
import actividad1.ProfesorCarrera;


/**
 *
 * @author alumno
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo triangulo =new Triangulo();
        System.out.println(triangulo);
        
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        
        Triangulo triangulo2 = triangulo;
        
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo.getBase());
        System.out.println(triangulo2.getBase());
        
        triangulo2.setBase(triangulo.getBeta());
        System.out.println(triangulo2.getBase());
        System.out.println("####################################################");
        
        Gato gato1 = new Gato();
        System.out.println(gato1);
        
        Perro perro1=new Perro();
        System.out.println(perro1);
        
        Alumno alumno1=new Alumno();
        System.out.println(alumno1);
        
        Mesero mesero1 =new Mesero();
        System.out.println(mesero1);
        
        ProfesorAsignatura profeA =new  ProfesorAsignatura();
        System.out.println(profeA);
        
        ProfesorCarrera profeCa =new ProfesorCarrera();
        System.out.println(profeCa);
        
        
    }
    
}





