package Recursos;

public class Periodo {
    private int IDPeriodo;
    private String Codigo;
    private int Anio;
    private int Semestre;

    // Constructor
    public Periodo(int IDPeriodo, String Codigo, int Anio, int Semestre) {
        this.IDPeriodo = IDPeriodo;
        this.Codigo = Codigo;
        this.Anio = Anio;
        this.Semestre = Semestre;
    }

    public int getIDPeriodo() {
        return IDPeriodo;
    }

    public void setIDPeriodo(int iDPeriodo) {
        IDPeriodo = iDPeriodo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        Semestre = semestre;
    }

}