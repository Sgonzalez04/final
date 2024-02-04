package view;

import Servicios.ProfesoresService;
import Recursos.Profesor;

import java.sql.Date;
import java.util.Scanner;

public class MenuProfesores {
    private ProfesoresService profesoresService;
    private Scanner scanner;

    public MenuProfesores(ProfesoresService profesoresService, Scanner scanner) {
        this.profesoresService = profesoresService;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Gestionar Profesores -----");
            System.out.println("1. Agregar Profesor");
            System.out.println("2. Eliminar Profesor");
            System.out.println("3. Buscar Profesor");
            System.out.println("4. Listar Profesores");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProfesor();
                    break;
                case 2:
                    eliminarProfesor();
                    break;
                case 3:
                    buscarProfesor();
                    break;
                case 4:
                    listarProfesores();
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

    private void agregarProfesor() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el ID del profesor:");
            int id = input.nextInt();
            input.nextLine(); // Limpiar el buffer del scanner
            System.out.println("Ingrese el tipo de documento:");
            String tipoDocumento = input.nextLine();
            System.out.println("Ingrese el número de documento:");
            String numeroDocumento = input.nextLine();
            System.out.println("Ingrese los nombres del profesor:");
            String nombres = input.nextLine();
            System.out.println("Ingrese los apellidos del profesor:");
            String apellidos = input.nextLine();
            System.out.println("Ingrese la ciudad de residencia:");
            String ciudadResidencia = input.nextLine();
            System.out.println("Ingrese la dirección:");
            String direccion = input.nextLine();
            System.out.println("Ingrese el teléfono:");
            String telefono = input.nextLine();
            System.out.println("Ingrese la fecha de nacimiento (formato: YYYY-MM-DD):");
            String fechaNacimientoStr = input.nextLine();
            // Convertir fecha de nacimiento a Date
            Date fechaNacimiento = Date.valueOf(fechaNacimientoStr);
            System.out.println("Ingrese el sexo:");
            String sexo = input.nextLine();
            System.out.println("Ingrese el ID del departamento:");
            int idDepartamento = input.nextInt();
    
            // Crear un nuevo objeto Profesor con los datos ingresados
            Profesor nuevoProfesor = new Profesor(id, tipoDocumento, numeroDocumento, nombres, apellidos,
                    ciudadResidencia, direccion, telefono, fechaNacimiento, sexo, id, idDepartamento);
    
            // Llamar al método agregarProfesor() del servicio de profesores
            profesoresService.agregarProfesor(nuevoProfesor);
    
            System.out.println("Profesor agregado con éxito.");
        }
    }
    

    private void eliminarProfesor() {
        System.out.println("Ingrese el ID del profesor a eliminar:");
        int id = scanner.nextInt();
        profesoresService.eliminarProfesor(id);
        System.out.println("Profesor eliminado con éxito.");
    }

    private void buscarProfesor() {
        System.out.println("Ingrese el ID del profesor a buscar:");
        int id = scanner.nextInt();
        Profesor profesor = profesoresService.buscarProfesor(id);
        if (profesor != null) {
            System.out.println("Profesor encontrado:");
            System.out.println(profesor);
        } else {
            System.out.println("No se encontró ningún profesor con ese ID.");
        }
    }

    private void listarProfesores() {
        System.out.println("Listado de profesores:");
        for (Profesor profesor : profesoresService.obtenerTodos()) {
            System.out.println(profesor);
        }
    }
}
