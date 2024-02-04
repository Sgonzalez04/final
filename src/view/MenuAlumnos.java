package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Recursos.Alumno;
import Servicios.AlumnosService;

public class MenuAlumnos {
    private AlumnosService alumnosService;
    private Scanner scanner;

    public MenuAlumnos(AlumnosService alumnosService, Scanner scanner) {
        this.alumnosService = alumnosService;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Gestionar Alumnos -----");
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Eliminar Alumno");
            System.out.println("3. Buscar Alumno");
            System.out.println("4. Listar Alumnos");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    eliminarAlumno();
                    break;
                case 3:
                    buscarAlumno();
                    break;
                case 4:
                    listarAlumnos();
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

    private void agregarAlumno() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el ID del alumno:");
            int id = input.nextInt();
            input.nextLine(); // Limpiar el buffer del scanner
            System.out.println("Ingrese el tipo de documento:");
            String tipoDocumento = input.nextLine();
            System.out.println("Ingrese el número de documento:");
            String numeroDocumento = input.nextLine();
            System.out.println("Ingrese los nombres del alumno:");
            String nombres = input.nextLine();
            System.out.println("Ingrese los apellidos del alumno:");
            String apellidos = input.nextLine();
            System.out.println("Ingrese la ciudad de residencia:");
            String ciudadResidencia = input.nextLine();
            System.out.println("Ingrese la dirección:");
            String direccion = input.nextLine();
            System.out.println("Ingrese el teléfono:");
            String telefono = input.nextLine();
            System.out.println("Ingrese la fecha de nacimiento (formato: YYYY-MM-DD):");
            String fechaNacimientoStr = input.nextLine();

            // Parsear la fecha de nacimiento a tipo Date
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNacimiento = formatter.parse(fechaNacimientoStr);

            // Creamos un objeto Alumno con los datos ingresados
            Alumno nuevoAlumno = new Alumno(id, tipoDocumento, numeroDocumento, nombres, apellidos, ciudadResidencia
            , direccion, telefono, fechaNacimiento, fechaNacimientoStr, id);

            // Llamamos al método agregarAlumno() del servicio de alumnos
            alumnosService.agregarAlumno(nuevoAlumno);

            System.out.println("Alumno agregado con éxito.");
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha de nacimiento incorrecto. Utilice el formato YYYY-MM-DD.");
        }
    }

    


    private void eliminarAlumno() {
        System.out.println("Ingrese el ID del alumno a eliminar:");
        int id = scanner.nextInt();
        alumnosService.eliminarAlumno(id);
        System.out.println("Alumno eliminado con éxito.");
    }

    private void buscarAlumno() {
        System.out.println("Ingrese el ID del alumno a buscar:");
        int id = scanner.nextInt();
        Alumno alumno = alumnosService.buscarAlumno(id);
        if (alumno != null) {
            System.out.println("Alumno encontrado:");
            System.out.println(alumno);
        } else {
            System.out.println("No se encontró ningún alumno con ese ID.");
        }
    }

    private void listarAlumnos() {
        System.out.println("Listado de alumnos:");
        for (Alumno alumno : alumnosService.obtenerTodosAlumnos()) {
            System.out.println(alumno);
        }
    }
}
