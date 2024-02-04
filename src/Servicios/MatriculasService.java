package Servicios;

import java.util.ArrayList;
import java.util.List;

import Recursos.Matricula;

public class MatriculasService {
    private List<Matricula> matriculas;

    public MatriculasService() {
        this.matriculas = new ArrayList<>();
    }

    public void agregarMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public void eliminarMatricula(int idMatricula) {
        matriculas.removeIf(matricula -> matricula.getIDMatricula() == idMatricula);
    }

    public Matricula buscarMatricula(int idMatricula) {
        for (Matricula matricula : matriculas) {
            if (matricula.getIDMatricula() == idMatricula) {
                return matricula;
            }
        }
        return null;
    }

    public List<Matricula> obtenerTodasMatriculas() {
        return new ArrayList<>(matriculas);
    }
}
