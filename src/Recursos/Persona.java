package Recursos;

import java.util.Date;

public class Persona {
    private int IDPersona;
    private String TipoDocumento;
    private String NumeroDocumento;
    private String Nombres;
    private String Apellidos;
    private String CiudadResidencia;
    private String Direccion;
    private String Telefono;
    private Date FechaNacimiento;
    private String Sexo;

    // Constructor
    public Persona(int IDPersona, String TipoDocumento, String NumeroDocumento, String Nombres, String Apellidos,
                   String CiudadResidencia, String Direccion, String Telefono, Date FechaNacimiento, String Sexo) {
        this.IDPersona = IDPersona;
        this.TipoDocumento = TipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.CiudadResidencia = CiudadResidencia;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
    }

    public int getIDPersona() {
        return IDPersona;
    }

    public void setIDPersona(int iDPersona) {
        IDPersona = iDPersona;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCiudadResidencia() {
        return CiudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        CiudadResidencia = ciudadResidencia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }


}
