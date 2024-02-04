package Recursos;

public class Programa {
    private int IDPrograma;
    private String Nombre;
    private String Nivel;

    // Constructor
    public Programa(int IDPrograma, String Nombre, String Nivel) {
        this.IDPrograma = IDPrograma;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
    }

    public int getIDPrograma() {
        return IDPrograma;
    }

    public void setIDPrograma(int iDPrograma) {
        IDPrograma = iDPrograma;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }

}