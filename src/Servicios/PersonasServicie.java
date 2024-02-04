package Servicios;

import Recursos.Persona;
import java.util.HashMap;
import java.util.Map;

public class PersonasServicie {
    private Map<Integer, Persona> personas;

    public PersonasServicie() {
        this.personas = new HashMap<>();
    }

    public Persona obtenerPersonaPorID(int IDPersona) {
        return personas.get(IDPersona);
    }

    public void agregarPersona(Persona persona) {
        personas.put(persona.getIDPersona(), persona);
    }

    public void actualizarPersona(int IDPersona, Persona persona) {
        personas.put(IDPersona, persona);
    }
    public void eliminarPersona(int IDPersona) {
        personas.remove(IDPersona);
    }
}
