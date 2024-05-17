package com.abi_frey.Dao;

import com.abi_frey.Entidades.Medico;

import java.util.HashMap;

public class MedicoDao {

    private HashMap<Integer, Medico> medicos = new HashMap<Integer, Medico>();

    private static MedicoDao instance;

    private MedicoDao() {
    }

    public static MedicoDao getInstance(){
        if (instance == null){
            instance = new MedicoDao();
        }
        return instance;
    }

    public void create(int medico_id, Medico medico) {
        medicos.put(medico_id,medico);
    }

    public void update(int medico_id, Medico medico) {
        if (medicos.get(medico_id) == null){
            medicos.put(medico_id, medico);
        }
        else {
            System.out.println("Este id ya es utilizado por otro medico");
        }
    }

    public Medico get_one(int medico_id) {
        return medicos.get(medico_id);
    }

    public HashMap<Integer,Medico> get_all(){
        return medicos;
    }

    public void delete(int medico_id) {
        medicos.remove(medico_id);
    }

}
