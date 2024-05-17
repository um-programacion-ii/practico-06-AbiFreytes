package com.tomas_grau.Servicios;

import com.tomas_grau.Dao.MedicoDao;
import com.tomas_grau.Dao.RecetaDao;
import com.tomas_grau.Entidades.Receta;
import com.tomas_grau.Entidades.Turno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AtencionMedicoService {
    private RecetaDao recetaDao = RecetaDao.getInstance();

    public AtencionMedicoService(){
    }

    public void procesar_turno(Turno turno){
        // Decidir si el medico realizara una receta o no
        Random random = new Random();
        boolean crear_receta = random.nextBoolean();

        if (crear_receta){
            // Crear receta con lista de medicamentos aleatorios
            // Crear una lista con nombres de medicamentos
            List<String> medicamentos = new ArrayList<>();
            medicamentos.add("Paracetamol");
            medicamentos.add("Ibuprofeno");
            medicamentos.add("Omeprazol");
            medicamentos.add("Amoxicilina");
            medicamentos.add("Loratadina");
            medicamentos.add("Aspirina");

            int min = 1;
            int max = 6;

            // Crear una instancia de Random
            Random rand = new Random();

            // Generar un número aleatorio entre min y max (ambos inclusive)
            int numeroAleatorio = rand.nextInt((max - min) + 1) + min;

            // Crear una nueva lista con medicamentos seleccionados al azar
            List<String> medicamentosAleatorios = seleccionarMedicamentosAleatorios(medicamentos, numeroAleatorio);

            Receta receta = new Receta(medicamentosAleatorios, turno.getPaciente_id());
            recetaDao.create_receta(turno.getTurno_id(), receta);
            System.out.println("Se creo una receta");
        }
        else {
            System.out.println("El medico atendio al paciente con número de turno " + turno.getTurno_id());
        }
    }

    public static List<String> seleccionarMedicamentosAleatorios(List<String> listaOriginal, int cantidad) {
        List<String> resultado = new ArrayList<>();
        Random random = new Random();

        // Asegurarnos de no seleccionar más medicamentos de los disponibles
        cantidad = Math.min(cantidad, listaOriginal.size());

        // Seleccionar medicamentos al azar
        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = random.nextInt(listaOriginal.size());
            resultado.add(listaOriginal.get(indiceAleatorio));
            listaOriginal.remove(indiceAleatorio); // Evitar duplicados
        }
        return resultado;
    }

}
