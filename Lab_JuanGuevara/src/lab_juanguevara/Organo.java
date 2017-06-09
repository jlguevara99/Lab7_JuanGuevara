/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_juanguevara;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Organo {

    private String color;
    private ArrayList<String> caracteristicas = new ArrayList();

    private int potenciado;
    private int prueba;

    public Organo() {
    }

    public Organo(String color, int potenciado, int prueba) {
        this.color = color;
        this.potenciado = potenciado;
        this.prueba = prueba;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getPotenciado() {
        return potenciado;
    }

    public void setPotenciado(int potenciado) {
        this.potenciado = potenciado;
    }

    public int getPrueba() {
        return prueba;
    }

    public void setPrueba(int prueba) {
        this.prueba = prueba;
    }

}
