package Recursos;

import java.util.Date;

public class Alumno extends Persona {
    private int IDAlumno;

    public Alumno(int IDPersona, String TipoDocumento, String NumeroDocumento, String Nombres, String Apellidos,
                  String CiudadResidencia, String Direccion, String Telefono, Date FechaNacimiento, String Sexo,
                  int IDAlumno) {
        super(IDPersona, TipoDocumento, NumeroDocumento, Nombres, Apellidos, CiudadResidencia, Direccion, Telefono,
                FechaNacimiento, Sexo);
        this.IDAlumno = IDAlumno;
    }

    public int getIDAlumno() {
        return IDAlumno;
    }

    public void setIDAlumno(int iDAlumno) {
        IDAlumno = iDAlumno;
    }   
}
