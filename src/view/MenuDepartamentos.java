package view;

import Recursos.Departamento;
import Servicios.DepartamentosService;

import java.util.Scanner;

public class MenuDepartamentos {
    private DepartamentosService departamentosService;
    private Scanner scanner;

    public MenuDepartamentos(DepartamentosService departamentosService, Scanner scanner) {
        this.departamentosService = departamentosService;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Gestionar Departamentos -----");
            System.out.println("1. Agregar Departamento");
            System.out.println("2. Eliminar Departamento");
            System.out.println("3. Buscar Departamento");
            System.out.println("4. Listar Departamentos");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarDepartamento();
                    break;
                case 2:
                    eliminarDepartamento();
                    break;
                case 3:
                    buscarDepartamento();
                    break;
                case 4:
                    listarDepartamentos();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private void agregarDepartamento() {
        System.out.println("Ingrese el ID del departamento:");
        int id = scanner.nextInt();
        System.out.println("Ingrese el nombre del departamento:");
        String nombre = scanner.next();
        Departamento nuevoDepartamento = new Departamento(id, nombre);
        departamentosService.agregarDepartamento(nuevoDepartamento);
        System.out.println("Departamento agregado con éxito.");
    }

    private void eliminarDepartamento() {
        System.out.println("Ingrese el ID del departamento a eliminar:");
        int id = scanner.nextInt();
        departamentosService.eliminarDepartamento(id);
        System.out.println("Departamento eliminado con éxito.");
    }

    private void buscarDepartamento() {
        System.out.println("Ingrese el ID del departamento a buscar:");
        int id = scanner.nextInt();
        Departamento departamento = departamentosService.buscarDepartamento(id);
        if (departamento != null) {
            System.out.println("Departamento encontrado:");
            System.out.println(departamento);
        } else {
            System.out.println("No se encontró ningún departamento con ese ID.");
        }
    }

    private void listarDepartamentos() {
        System.out.println("Listado de departamentos:");
        for (Departamento departamento : departamentosService.obtenerTodos()) {
            System.out.println(departamento);
        }
    }
}
