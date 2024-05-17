package com.tomas_grau.Entidades;

import java.util.List;

public class Receta {

    private List<String> medicamentos;
    private int paciente_id;

    public Receta() {
    }

    public Receta(List<String> medicamentos, int paciente_id) {
        this.medicamentos = medicamentos;
        this.paciente_id = paciente_id;
    }
}
