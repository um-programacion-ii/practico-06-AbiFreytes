package com.tomas_grau.Servicios;

import com.tomas_grau.Dao.MedicoDao;
import com.tomas_grau.Dao.TurnoDao;
import com.tomas_grau.Entidades.Medico;
import com.tomas_grau.Entidades.Paciente;
import com.tomas_grau.Entidades.Turno;

import java.util.HashMap;
import java.util.Objects;

public class GestionTurnoService {
    private MedicoDao medicodao = MedicoDao.getInstance();
    private TurnoDao turnoDao = TurnoDao.getInstance();
    int turnocounter = 1;

    public GestionTurnoService() {
    }

    public void solicitarTurno(String especialidad, Paciente paciente) {
        HashMap<Integer, Medico> medicos = medicodao.get_all();
        for (Medico medico : medicos.values()) {
            if (Objects.equals(medico.getEspecialidad(), especialidad) && medico.getObras_sociales().contains(paciente.getObra_social())) {
                Turno turno = new Turno(turnocounter, medico.getMedico_id(), paciente.getPaciente_id());
                turnoDao.create(turnocounter,turno);
                System.out.println("Se creo un turno");
                turnocounter ++;
                return;
            }
        }
        System.out.println("No se encontro un médico");
    }

}
