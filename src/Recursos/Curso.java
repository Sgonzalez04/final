package Recursos;

public class Curso {
    private int IDCurso;
    private String Nombre;
    private String GuiaCatedra;
    private int IDAsignatura;

    // Constructor
    public Curso(int IDCurso, String Nombre, String GuiaCatedra, int IDAsignatura) {
        this.IDCurso = IDCurso;
        this.Nombre = Nombre;
        this.GuiaCatedra = GuiaCatedra;
        this.IDAsignatura = IDAsignatura;
    }

    public int getIDCurso() {
        return IDCurso;
    }

    public void setIDCurso(int iDCurso) {
        IDCurso = iDCurso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGuiaCatedra() {
        return GuiaCatedra;
    }

    public void setGuiaCatedra(String guiaCatedra) {
        GuiaCatedra = guiaCatedra;
    }

    public int getIDAsignatura() {
        return IDAsignatura;
    }

    public void setIDAsignatura(int iDAsignatura) {
        IDAsignatura = iDAsignatura;
    }

}