/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_juanguevara;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Corazon extends Organo{
    private final int efectividad = 21564;

    public Corazon() {
    }

    public Corazon(String color, int potenciado, int prueba) {
        super(color, potenciado, prueba);
    }

    public int getEfectividad() {
        return efectividad;
    }
    @Override
    public String toString() {
        return super.toString()+"Corazon";
    }
    
}
