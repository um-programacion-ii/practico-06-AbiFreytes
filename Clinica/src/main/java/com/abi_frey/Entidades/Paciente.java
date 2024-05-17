package com.abi_frey.Entidades;

public class Paciente {

    private String nombre;
    private String apellido;
    private String obra_social;
    private int paciente_id;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String obra_social, int paciente_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.obra_social = obra_social;
        this.paciente_id = paciente_id;
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

    public String getObra_social() {
        return obra_social;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }
}
