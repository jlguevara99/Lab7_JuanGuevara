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
public class Pulmon extends Organo{
    private final int efectividad = 589321;

    public Pulmon() {
    }

    public Pulmon(Color color, int potenciado, int prueba) {
        super(color, potenciado, prueba);
    }

    public int getEfectividad() {
        return efectividad;
    }
    
}
