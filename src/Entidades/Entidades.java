package Entidades;

import java.sql.Time;
import java.util.Date;

// Clase Persona
class Persona {
    int IDPersona;
    String TipoDocumento;
    String NumeroDocumento;
    String Nombres;
    String Apellidos;
    String CiudadResidencia;
    String Direccion;
    String Telefono;
    Date FechaNacimiento;
    char Sexo;
}

// Clase Asignatura
class Asignatura {
    int IDAsignatura;
    String Nombre;
    int Creditos;
    int IDProfesor;
    int CupoDisponible;
    int IDPrograma;
}

// Clase Profesor
class Profesor {
    int IDProfesor;
    int IDDepartamento;
}

// Clase Matricula
class Matricula {
    int IDMatricula;
    int IDAlumno;
    int IDAsignatura;
    String Dia;
    Time HoraInicio;
    Time HoraFin;
    int IDSalon;
}

// Clase Programa
class Programa {
    int IDPrograma;
    String Nombre;
    String Nivel;
}

// Clase Salon
class Salon {
    int IDSalon;
    int Capacidad;
    String Edificio;
    int Piso;
    String NumeroIdentificacion;
}

// Clase Periodo
class Periodo {
    int IDPeriodo;
    String Codigo;
    int Anio;
    int Semestre;
}

// Clase Tarifa
class Tarifa {
    int IDTarifa;
    double Costo;
    int IDPeriodo;
    int IDPrograma;
}

// Clase Departamento
class Departamento {
    int IDDepartamento;
    String Nombre;
}

// Clase Alumno
class Alumno {
    int IDAlumno;
}

// Clase Curso
class Curso {
    int IDCurso;
    String Nombre;
    String GuiaCatedra;
    int IDAsignatura;
}
