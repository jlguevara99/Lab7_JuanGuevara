/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_juanguevara;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Doctor extends Persona{
   private ArrayList<String> especialidades = new ArrayList();
   private ArrayList<Paciente> pacientes = new ArrayList();
   private int años;
   private String hora;
   private ArrayList<String> dias = new ArrayList();

    public Doctor() {
    }

    public Doctor(int años, String hora, String nombre, int edad, int id, double altura, double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.años = años;
        this.hora = hora;
    }

   

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }
   
}
