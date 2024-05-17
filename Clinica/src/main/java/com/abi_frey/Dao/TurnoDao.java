package com.abi_frey.Dao;

import com.abi_frey.Entidades.Turno;

import java.util.HashMap;

public class TurnoDao {

    private HashMap<Integer, Turno> turnos = new HashMap<Integer, Turno>();

    private static TurnoDao instance;

    private TurnoDao() {
    }

    public static TurnoDao getInstance(){
        if (instance == null){
            instance = new TurnoDao();
        }
        return instance;
    }

    public void create(int turno_id, Turno turno){
            turnos.put(turno_id, turno);
    }

    public Turno get(int turno_id) {
        return turnos.get(turno_id);
    }



}
