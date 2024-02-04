package Servicios;

import java.util.ArrayList;
import java.util.List;
import Recursos.Alumno;

public class AlumnosService {
    private List<Alumno> alumnos;

    public AlumnosService() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumno != null) {
            this.alumnos.add(alumno);
        } else {
            System.out.println("Error: No se puede agregar un alumno nulo.");
        }
    }

    public void eliminarAlumno(int idAlumno) {
        alumnos.removeIf(alumno -> alumno.getIDAlumno() == idAlumno);
    }

    public Alumno buscarAlumno(int idAlumno) {
        for (Alumno alumno : alumnos) {
            if (alumno.getIDAlumno() == idAlumno) {
                return alumno;
            }
        }
        return null;
    }

    public List<Alumno> obtenerTodosAlumnos() {
        // Devuelve una copia de la lista para evitar modificaciones externas
        return new ArrayList<>(alumnos);
    }
}
