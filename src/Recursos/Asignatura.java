package Recursos;

public class Asignatura {
    private int IDAsignatura;
    private String Nombre;
    private int Creditos;
    private int IDProfesor;
    private int CupoDisponible;
    private int IDPrograma;

    // Constructor
    public Asignatura(int IDAsignatura, String Nombre, int Creditos, int IDProfesor, int CupoDisponible, int IDPrograma) {
        this.IDAsignatura = IDAsignatura;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        this.IDProfesor = IDProfesor;
        this.CupoDisponible = CupoDisponible;
        this.IDPrograma = IDPrograma;
    }

    public int getIDAsignatura() {
        return IDAsignatura;
    }

    public void setIDAsignatura(int iDAsignatura) {
        IDAsignatura = iDAsignatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int creditos) {
        Creditos = creditos;
    }

    public int getIDProfesor() {
        return IDProfesor;
    }

    public void setIDProfesor(int iDProfesor) {
        IDProfesor = iDProfesor;
    }

    public int getCupoDisponible() {
        return CupoDisponible;
    }

    public void setCupoDisponible(int cupoDisponible) {
        CupoDisponible = cupoDisponible;
    }

    public int getIDPrograma() {
        return IDPrograma;
    }

    public void setIDPrograma(int iDPrograma) {
        IDPrograma = iDPrograma;
    }
    
}