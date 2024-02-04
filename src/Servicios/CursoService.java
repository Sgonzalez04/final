package Servicios;

import java.util.ArrayList;
import java.util.List;

import Recursos.Curso;

public class CursoService {
    private List<Curso> cursos;

    public CursoService() {
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void eliminarCurso(int idCurso) {
        cursos.removeIf(curso -> curso.getIDCurso() == idCurso);
    }

    public Curso buscarCurso(int idCurso) {
        for (Curso curso : cursos) {
            if (curso.getIDCurso() == idCurso) {
                return curso;
            }
        }
        return null;
    }

    public List<Curso> obtenerTodosCursos() {
        return new ArrayList<>(cursos);
    }
}
