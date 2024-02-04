package Servicios;

import Recursos.Profesor;

import java.util.ArrayList;
import java.util.List;

public class ProfesoresService {

    private List<Profesor> profesores;

    public ProfesoresService() {
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void eliminarProfesor(int idProfesor) {
        profesores.removeIf(prof -> prof.getIDProfesor() == idProfesor);
    }

    public Profesor buscarProfesor(int idProfesor) {
        for (Profesor prof : profesores) {
            if (prof.getIDProfesor() == idProfesor) {
                return prof;
            }
        }
        return null;
    }

    public List<Profesor> obtenerTodos() {
        return new ArrayList<>(profesores);
    }
}
