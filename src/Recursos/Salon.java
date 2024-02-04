package Recursos;

public class Salon {
    private int IDSalon;
    private int Capacidad;
    private String Edificio;
    private int Piso;
    private String NumeroIdentificacion;

    // Constructor
    public Salon(int IDSalon, int Capacidad, String Edificio, int Piso, String NumeroIdentificacion) {
        this.IDSalon = IDSalon;
        this.Capacidad = Capacidad;
        this.Edificio = Edificio;
        this.Piso = Piso;
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public int getIDSalon() {
        return IDSalon;
    }

    public void setIDSalon(int iDSalon) {
        IDSalon = iDSalon;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public String getEdificio() {
        return Edificio;
    }

    public void setEdificio(String edificio) {
        Edificio = edificio;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int piso) {
        Piso = piso;
    }

    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }

}
