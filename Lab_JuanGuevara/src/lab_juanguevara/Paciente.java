/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_juanguevara;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Paciente {
    private ArrayList<String> enfermedad = new ArrayList();
    private Date fecha = new Date();
    private Date alta;
    private String tipo_S;
    private String causa;
    private ArrayList<String>alergia=new ArrayList();
    private ArrayList<Organo>organos = new ArrayList();

    public Paciente() {
    }

    public Paciente(Date alta, String tipo_S, String causa) {
        this.alta = alta;
        this.tipo_S = tipo_S;
        this.causa = causa;
    }

    public ArrayList<String> getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(ArrayList<String> enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public String getTipo_S() {
        return tipo_S;
    }

    public void setTipo_S(String tipo_S) {
        this.tipo_S = tipo_S;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public ArrayList<String> getAlergia() {
        return alergia;
    }

    public void setAlergia(ArrayList<String> alergia) {
        this.alergia = alergia;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }
    
}
