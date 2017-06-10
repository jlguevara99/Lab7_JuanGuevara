/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_juanguevara;

import javax.swing.JProgressBar;

/**
 *
 * @author HP
 */
public class Hilo extends Thread{
    private int num1;
    private int num2;
    private boolean s = true;
    private JProgressBar pg;

    public Hilo(int num1, int num2, JProgressBar pg) {
        this.num1 = num1;
        this.num2 = num2;
        this.pg = pg;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public JProgressBar getPg() {
        return pg;
    }

    public void setPg(JProgressBar pg) {
        this.pg = pg;
    }
    @Override
    public void run(){
        while(s){
            pg.setValue(num1*num2);
        }
    }
}
