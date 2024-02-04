package Recursos;

public class Matricula {
    private int IDMatricula;
    private int IDAlumno;
    private int IDAsignatura;
    private String Dia;
    private String HoraInicio;
    private String HoraFin;
    private int IDSalon;

    // Constructor
    public Matricula(int IDMatricula, int IDAlumno, int IDAsignatura, String Dia, String HoraInicio, String HoraFin, int IDSalon) {
        this.IDMatricula = IDMatricula;
        this.IDAlumno = IDAlumno;
        this.IDAsignatura = IDAsignatura;
        this.Dia = Dia;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.IDSalon = IDSalon;
    }

    public int getIDMatricula() {
        return IDMatricula;
    }

    public void setIDMatricula(int iDMatricula) {
        IDMatricula = iDMatricula;
    }

    public int getIDAlumno() {
        return IDAlumno;
    }

    public void setIDAlumno(int iDAlumno) {
        IDAlumno = iDAlumno;
    }

    public int getIDAsignatura() {
        return IDAsignatura;
    }

    public void setIDAsignatura(int iDAsignatura) {
        IDAsignatura = iDAsignatura;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String horaInicio) {
        HoraInicio = horaInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }

    public int getIDSalon() {
        return IDSalon;
    }

    public void setIDSalon(int iDSalon) {
        IDSalon = iDSalon;
    }

}