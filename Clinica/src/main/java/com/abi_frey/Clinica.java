package com.tomas_grau;

import com.tomas_grau.Dao.MedicoDao;
import com.tomas_grau.Dao.TurnoDao;
import com.tomas_grau.Entidades.Medico;
import com.tomas_grau.Entidades.Paciente;
import com.tomas_grau.Servicios.AtencionMedicoService;
import com.tomas_grau.Servicios.GestionTurnoService;

import java.util.ArrayList;
import java.util.List;


public class Clinica {
    public static void main(String[] args) {
        List<String> obra_sociales = new ArrayList<>();
        obra_sociales.add("particular");

        Medico eusebio_medico = new Medico("Eusebio", "Fernández", "Cardiólogo",1,obra_sociales);
        Medico carlos_medico = new Medico("Carlos", "Medicina","Urólogo",2,obra_sociales);

        MedicoDao medicodao = MedicoDao.getInstance();
        TurnoDao turnodao = TurnoDao.getInstance();

        medicodao.create(1,eusebio_medico);
        medicodao.create(2,carlos_medico);

        GestionTurnoService gestionTurnoService = new GestionTurnoService();
        gestionTurnoService.solicitarTurno("Cardiólogo",new Paciente("Carlos", "Garcia", "particular", 1));



        AtencionMedicoService atencion_medica = new AtencionMedicoService();

        atencion_medica.procesar_turno(turnodao.get(1));






    }
}