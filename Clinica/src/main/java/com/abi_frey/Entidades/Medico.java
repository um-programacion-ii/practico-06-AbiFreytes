package com.abi_frey.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Medico {

    private String nombre;
    private String apellido;
    private String especialidad;
    private int medico_id;
    private List<String> obras_sociales;

    public Medico() {
    }

    public Medico(String nombre, String apellido, String especialidad, int medico_id, List<String> obras_sociales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.medico_id = medico_id;
        this.obras_sociales = obras_sociales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }

    public List<String> getObras_sociales() {
        return obras_sociales;
    }

    public void setObras_sociales(List<String> obras_sociales) {
        this.obras_sociales = obras_sociales;
    }
}
