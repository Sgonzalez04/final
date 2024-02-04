package Recursos;

public class Tarifa {
    private int IDTarifa;
    private double Costo;
    private int IDPeriodo;
    private int IDPrograma;

    // Constructor
    public Tarifa(int IDTarifa, double Costo, int IDPeriodo, int IDPrograma) {
        this.IDTarifa = IDTarifa;
        this.Costo = Costo;
        this.IDPeriodo = IDPeriodo;
        this.IDPrograma = IDPrograma;
    }

    public int getIDTarifa() {
        return IDTarifa;
    }

    public void setIDTarifa(int iDTarifa) {
        IDTarifa = iDTarifa;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double costo) {
        Costo = costo;
    }

    public int getIDPeriodo() {
        return IDPeriodo;
    }

    public void setIDPeriodo(int iDPeriodo) {
        IDPeriodo = iDPeriodo;
    }

    public int getIDPrograma() {
        return IDPrograma;
    }

    public void setIDPrograma(int iDPrograma) {
        IDPrograma = iDPrograma;
    }
    
}