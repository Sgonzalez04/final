package view;

import java.util.Scanner;

import Recursos.Curso;
import Servicios.CursoService;

public class MenuCursos {
    private CursoService cursoService;
    private Scanner scanner;

    public MenuCursos(CursoService cursoService, Scanner scanner) {
        this.cursoService = cursoService;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Gestionar Cursos -----");
            System.out.println("1. Agregar Curso");
            System.out.println("2. Eliminar Curso");
            System.out.println("3. Buscar Curso");
            System.out.println("4. Listar Cursos");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarCurso();
                    break;
                case 2:
                    eliminarCurso();
                    break;
                case 3:
                    buscarCurso();
                    break;
                case 4:
                    listarCursos();
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

    private void agregarCurso() {
        System.out.println("Ingrese el ID del curso:");
        int idCurso = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();
        System.out.println("Ingrese la guía de cátedra:");
        String guiaCatedra = scanner.nextLine();
        System.out.println("Ingrese el ID de la asignatura del curso:");
        int idAsignatura = scanner.nextInt();

        // Crear el objeto Curso con los datos ingresados
        Curso nuevoCurso = new Curso(idCurso, nombreCurso, guiaCatedra, idAsignatura);

        // Agregar el curso utilizando el servicio
        cursoService.agregarCurso(nuevoCurso);

        System.out.println("Curso agregado con éxito.");
    }

    private void eliminarCurso() {
        System.out.println("Ingrese el ID del curso a eliminar:");
        int idCurso = scanner.nextInt();
        cursoService.eliminarCurso(idCurso);
        System.out.println("Curso eliminado con éxito.");
    }

    private void buscarCurso() {
        System.out.println("Ingrese el ID del curso a buscar:");
        int idCurso = scanner.nextInt();
        Curso curso = cursoService.buscarCurso(idCurso);
        if (curso != null) {
            System.out.println("Curso encontrado:");
            System.out.println("ID: " + curso.getIDCurso());
            System.out.println("Nombre: " + curso.getNombre());
            System.out.println("Guía de cátedra: " + curso.getGuiaCatedra());
            System.out.println("ID de la asignatura: " + curso.getIDAsignatura());
        } else {
            System.out.println("No se encontró ningún curso con ese ID.");
        }
    }

    private void listarCursos() {
        System.out.println("Listado de cursos:");
        for (Curso curso : cursoService.obtenerTodosCursos()) {
            System.out.println("ID: " + curso.getIDCurso());
            System.out.println("Nombre: " + curso.getNombre());
            System.out.println("Guía de cátedra: " + curso.getGuiaCatedra());
            System.out.println("ID de la asignatura: " + curso.getIDAsignatura());
            System.out.println("--------------------------------");
        }
    }
}
