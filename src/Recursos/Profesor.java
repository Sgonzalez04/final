package Recursos;

import java.sql.Date;

public class Profesor extends Persona {
    private int IDProfesor;
    private int IDDepartamento;

    public Profesor(int IDPersona, String TipoDocumento, String NumeroDocumento, String Nombres, String Apellidos,
                    String CiudadResidencia, String Direccion, String Telefono, Date FechaNacimiento, String Sexo,
                    int IDProfesor, int IDDepartamento) {
        super(IDPersona, TipoDocumento, NumeroDocumento, Nombres, Apellidos, CiudadResidencia, Direccion, Telefono,
                FechaNacimiento, Sexo);
        this.IDProfesor = IDProfesor;
        this.IDDepartamento = IDDepartamento;
    }

    public int getIDProfesor() {
        return IDProfesor;
    }

    public int getIDDepartamento() {
        return IDDepartamento;
    }
    
}
