package Servicios;

import Recursos.Departamento;

import java.util.ArrayList;
import java.util.List;

 public class DepartamentosService {

    private List<Departamento> departamentos;

    public DepartamentosService() {
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void eliminarDepartamento(int idDepartamento) {
        departamentos.removeIf(dep -> dep.getIDDepartamento() == idDepartamento);
    }

    public Departamento buscarDepartamento(int idDepartamento) {
        for (Departamento dep : departamentos) {
            if (dep.getIDDepartamento() == idDepartamento) {
                return dep;
            }
        }
        return null;
    }

    public List<Departamento> obtenerTodos() {
        return new ArrayList<>(departamentos);
    }
}