package Servicios;

import Recursos.Tarifa;

import java.util.ArrayList;
import java.util.List;

public class TarifasService {

    private List<Tarifa> tarifas;

    public TarifasService() {
        this.tarifas = new ArrayList<>();
    }

    public void agregarTarifa(Tarifa tarifa) {
        tarifas.add(tarifa);
    }

    public void eliminarTarifa(int idTarifa) {
        tarifas.removeIf(t -> t.getIDTarifa() == idTarifa);
    }

    public Tarifa buscarTarifa(int idTarifa) {
        for (Tarifa t : tarifas) {
            if (t.getIDTarifa() == idTarifa) {
                return t;
            }
        }
        return null;
    }

    public List<Tarifa> obtenerTodas() {
        return new ArrayList<>(tarifas);
    }
}
