package view;

import java.util.Scanner;
import Servicios.AsignaturasService;
import Recursos.Asignatura;

public class MenuAsignaturas {
    private AsignaturasService asignaturasService;
    private Scanner scanner;

    public MenuAsignaturas(AsignaturasService asignaturasService, Scanner scanner) {
        this.asignaturasService = asignaturasService;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Gestionar Asignaturas -----");
            System.out.println("1. Agregar Asignatura");
            System.out.println("2. Eliminar Asignatura");
            System.out.println("3. Buscar Asignatura");
            System.out.println("4. Listar Asignaturas");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarAsignatura();
                    break;
                case 2:
                    eliminarAsignatura();
                    break;
                case 3:
                    buscarAsignatura();
                    break;
                case 4:
                    listarAsignaturas();
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

    private void agregarAsignatura() {
        System.out.println("Ingrese el ID de la asignatura:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Ingrese el nombre de la asignatura:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de créditos:");
        int creditos = scanner.nextInt();
        System.out.println("Ingrese el ID del profesor:");
        int idProfesor = scanner.nextInt();
        System.out.println("Ingrese el cupo disponible:");
        int cupoDisponible = scanner.nextInt();
        System.out.println("Ingrese el ID del programa:");
        int idPrograma = scanner.nextInt();

        // Crear un objeto Asignatura con los datos ingresados
        Asignatura nuevaAsignatura = new Asignatura(id, nombre, creditos, idProfesor, cupoDisponible, idPrograma);

        // Llamar al método agregarAsignatura() del servicio de asignaturas
        asignaturasService.agregarAsignatura(nuevaAsignatura);

        System.out.println("Asignatura agregada con éxito.");
    }

    private void eliminarAsignatura() {
        System.out.println("Ingrese el ID de la asignatura a eliminar:");
        int id = scanner.nextInt();
        asignaturasService.eliminarAsignatura(id);
        System.out.println("Asignatura eliminada con éxito.");
    }

    private void buscarAsignatura() {
        System.out.println("Ingrese el ID de la asignatura a buscar:");
        int id = scanner.nextInt();
        Asignatura asignatura = asignaturasService.obtenerAsignaturaPorID(id);
        if (asignatura != null) {
            System.out.println("Asignatura encontrada:");
            System.out.println(asignatura);
        } else {
            System.out.println("No se encontró ninguna asignatura con ese ID.");
        }
    }

    private void listarAsignaturas() {
        System.out.println("Listado de asignaturas:");
        for (Asignatura asignatura : asignaturasService.obtenerTodos()) {
            System.out.println(asignatura);
        }
    }
}
