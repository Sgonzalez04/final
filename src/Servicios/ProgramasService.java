package Servicios;

import Recursos.Programa;

import java.util.ArrayList;
import java.util.List;

public class ProgramasService {

    private List<Programa> programas;

    public ProgramasService() {
        this.programas = new ArrayList<>();
    }

    public void agregarPrograma(Programa programa) {
        programas.add(programa);
    }

    public void eliminarPrograma(int idPrograma) {
        programas.removeIf(prog -> prog.getIDPrograma() == idPrograma);
    }

    public Programa buscarPrograma(int idPrograma) {
        for (Programa prog : programas) {
            if (prog.getIDPrograma() == idPrograma) {
                return prog;
            }
        }
        return null;
    }

    public List<Programa> obtenerTodos() {
        return new ArrayList<>(programas);
    }
}
