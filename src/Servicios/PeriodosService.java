package Servicios;

import Recursos.Periodo;

import java.util.ArrayList;
import java.util.List;

public class PeriodosService {

    private List<Periodo> periodos;

    public PeriodosService() {
        this.periodos = new ArrayList<>();
    }

    public void agregarPeriodo(Periodo periodo) {
        periodos.add(periodo);
    }

    public void eliminarPeriodo(int idPeriodo) {
        periodos.removeIf(p -> p.getIDPeriodo() == idPeriodo);
    }

    public Periodo buscarPeriodo(int idPeriodo) {
        for (Periodo p : periodos) {
            if (p.getIDPeriodo() == idPeriodo) {
                return p;
            }
        }
        return null;
    }

    public List<Periodo> obtenerTodos() {
        return new ArrayList<>(periodos);
    }
}
