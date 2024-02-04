package view;

import java.util.Scanner;
import Servicios.ProgramasService;
import Recursos.Programa;

public class MenuProgramas {
    private ProgramasService programasService;
    private Scanner scanner;

    public MenuProgramas(ProgramasService programasService, Scanner scanner) {
        this.programasService = programasService;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Gestionar Programas -----");
            System.out.println("1. Agregar Programa");
            System.out.println("2. Eliminar Programa");
            System.out.println("3. Buscar Programa por ID");
            System.out.println("4. Listar Programas");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarPrograma();
                    break;
                case 2:
                    eliminarPrograma();
                    break;
                case 3:
                    buscarProgramaPorID();
                    break;
                case 4:
                    listarProgramas();
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

    private void agregarPrograma() {
        
    }

    private void eliminarPrograma() {

    }

    private void buscarProgramaPorID() {
        
    }

    private void listarProgramas() {
        System.out.println("Listado de Programas:");
        for (Programa programa : programasService.obtenerTodos()) {
            System.out.println("ID: " + programa.getIDPrograma());
            System.out.println("Nombre: " + programa.getNombre());
            System.out.println("Nivel: " + programa.getNivel());
            System.out.println("--------------------");
        }
    }
}
