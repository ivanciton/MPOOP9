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
public abstract class Mascota extends SerVivo {
    private String color;
    private String colorOjos;
    private String raza;
    
    public abstract void jugar();
    public abstract void saltar();
    public abstract void dormir();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Mascota{" + "color=" + color + ", colorOjos=" + colorOjos + ", raza=" + raza + '}';
    }

    
    

    
    
    
}
