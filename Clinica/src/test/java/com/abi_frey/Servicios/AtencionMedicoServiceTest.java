package com.abi_frey.Servicios;

import com.abi_frey.Dao.RecetaDao;
import com.abi_frey.Entidades.Receta;
import com.abi_frey.Entidades.Turno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AtencionMedicoServiceTest {
    private AtencionMedicoService atencionMedicoService;
    private RecetaDao recetaDao;

    @BeforeEach
    public void setUp() {
        recetaDao = Mockito.mock(RecetaDao.class);
        atencionMedicoService = new AtencionMedicoService();
        atencionMedicoService.recetaDao = recetaDao;
    }

    @Test
    public void testProcesarTurno() {
        Turno turno = new Turno();
        turno.setTurno_id(1);
        turno.setPaciente_id(1);

        atencionMedicoService.procesar_turno(turno);

        verify(recetaDao, atLeastOnce()).create_receta(anyInt(), any(Receta.class));
    }

    @Test
    public void testSeleccionarMedicamentosAleatorios() {
        List<String> medicamentos = Arrays.asList("Paracetamol", "Ibuprofeno", "Omeprazol", "Amoxicilina", "Loratadina", "Aspirina");
        List<String> medicamentosSeleccionados = AtencionMedicoService.seleccionarMedicamentosAleatorios(medicamentos, 3);

        assertEquals(3, medicamentosSeleccionados.size());
    }
}
