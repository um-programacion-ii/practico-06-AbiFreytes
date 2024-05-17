package com.tomas_grau.Entidades;

public class Turno {
    private int turno_id;
    private int medico_id;
    private int paciente_id;

    public Turno() {
    }

    public Turno(int turno_id, int medico_id, int paciente_id) {
        this.turno_id = turno_id;
        this.medico_id = medico_id;
        this.paciente_id = paciente_id;
    }

    public int getTurno_id() {
        return turno_id;
    }

    public void setTurno_id(int turno_id) {
        this.turno_id = turno_id;
    }

    public int getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }
}
