import java.util.Scanner;

import Servicios.AlumnosService;
import Servicios.AsignaturasService;
import Servicios.CursoService;
import Servicios.DepartamentosService;
import Servicios.MatriculasService;
import Servicios.ProfesoresService;
import Servicios.ProgramasService;
import Servicios.SalonesService;
import Servicios.TarifasService;
import view.MenuAlumnos;
import view.MenuAsignaturas;
import view.MenuCursos;
import view.MenuDepartamentos;
import view.MenuProfesores;
import view.MenuProgramas;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar usuario y contraseña de la base de datos
        System.out.println("Ingrese el usuario de la base de datos: ");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese la contraseña de la base de datos: ");
        String contraseña = scanner.nextLine();

        // Crear una instancia de Conexion y conectar a la base de datos
        Conexion conexion = new Conexion("Proyecto", usuario, contraseña);
        conexion.conectar();

        // Si la conexión se establece correctamente, proceder con el menú principal
        if (conexion.conectar() != null) {
            DepartamentosService departamentosService = new DepartamentosService();
            ProfesoresService profesorService = new ProfesoresService();
            AlumnosService alumnoService = new AlumnosService();
            CursoService cursoService = new CursoService();
            AsignaturasService asignaturaService = new AsignaturasService();
            ProgramasService programaService = new ProgramasService();
            SalonesService salonService = new SalonesService();
            TarifasService tarifaService = new TarifasService();
            MatriculasService matriculaService = new MatriculasService();

            int opcion;
            do {
                // Mostrar el menú principal
                System.out.println("----- Menú Principal -----");
                System.out.println("1. Gestionar Departamentos");
                System.out.println("2. Gestionar Profesores");
                System.out.println("3. Gestionar Alumnos");
                System.out.println("4. Gestionar Cursos");
                System.out.println("5. Gestionar Asignaturas");
                System.out.println("6. Gestionar Programas");
                System.out.println("7. Gestionar Salones");
                System.out.println("8. Gestionar Tarifas");
                System.out.println("9. Gestionar Matrículas");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                
                // Consumir el carácter de nueva línea pendiente
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        // Gestionar Departamentos
                        MenuDepartamentos menuDepartamentos = new MenuDepartamentos(departamentosService, scanner);
                        menuDepartamentos.mostrarMenu();
                        break;
                    case 2:
                        // Gestionar Profesores
                        MenuProfesores menuProfesores = new MenuProfesores(profesorService, scanner);
                        menuProfesores.mostrarMenu();
                        break;
                    case 3:
                        // Gestionar Alumnos
                        MenuAlumnos menuAlumnos = new MenuAlumnos(alumnoService, scanner);
                        menuAlumnos.mostrarMenu();
                        break;
                    case 4:
                        // Gestionar Cursos
                        MenuCursos menuCursos = new MenuCursos(cursoService, scanner);
                        menuCursos.mostrarMenu();
                        break;
                    case 5:
                        // Gestionar Asignaturas
                        MenuAsignaturas menuAsignaturas = new MenuAsignaturas(asignaturaService, scanner);
                        menuAsignaturas.mostrarMenu();
                        break;
                    
                    case 6:
                        // Gestionar Programas
                        MenuProgramas menuProgramas = new MenuProgramas(programasService, scanner);
                        menuProgramas.mostrarMenu();
                        break;
                    
                    case 7:
                        // Gestionar Salones
                        // Aquí puedes implementar la lógica para gestionar salones
                        break;
                    case 8:
                        // Gestionar Tarifas
                        // Aquí puedes implementar la lógica para gestionar tarifas
                        break;
                    case 9:
                        // Gestionar Matrículas
                        // Aquí puedes implementar la lógica para gestionar matrículas
                        break;
                    case 0:
                        // Salir del sistema
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                        break;
                }

            } while (opcion != 0);
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos. Saliendo del sistema...");
        }
        scanner.close();
    }
}
