package Servicios;

import Recursos.Asignatura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AsignaturasService {
    private Map<Integer, Asignatura> asignaturas;

    public AsignaturasService() {
        this.asignaturas = new HashMap<>();
    }

    public Asignatura obtenerAsignaturaPorID(int IDAsignatura) {
        return asignaturas.get(IDAsignatura);
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.put(asignatura.getIDAsignatura(), asignatura);
    }

    public void actualizarAsignatura(int IDAsignatura, Asignatura asignatura) {
        asignaturas.put(IDAsignatura, asignatura);
    }

    public void eliminarAsignatura(int IDAsignatura) {
        asignaturas.remove(IDAsignatura);
    }
    
    public List<Asignatura> obtenerTodos() {
        return new ArrayList<>(asignaturas.values());
    }
}
