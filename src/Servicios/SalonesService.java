package Servicios;

import Recursos.Salon;

import java.util.ArrayList;
import java.util.List;

public class SalonesService {

    private List<Salon> salones;

    public SalonesService() {
        this.salones = new ArrayList<>();
    }

    public void agregarSalon(Salon salon) {
        salones.add(salon);
    }

    public void eliminarSalon(int idSalon) {
        salones.removeIf(s -> s.getIDSalon() == idSalon);
    }

    public Salon buscarSalon(int idSalon) {
        for (Salon s : salones) {
            if (s.getIDSalon() == idSalon) {
                return s;
            }
        }
        return null;
    }

    public List<Salon> obtenerTodos() {
        return new ArrayList<>(salones);
    }
}
