package Recursos;

public class Departamento {
    private int IDDepartamento;
    private String Nombre;

    // Constructor
    public Departamento(int IDDepartamento, String Nombre) {
        this.IDDepartamento = IDDepartamento;
        this.Nombre = Nombre;
    }

    public int getIDDepartamento() {
        return IDDepartamento;
    }

    public void setIDDepartamento(int iDDepartamento) {
        IDDepartamento = iDDepartamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamento[IDDepartamento=" + IDDepartamento + ", Nombre=" + Nombre + "]";
    }

}