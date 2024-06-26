package mx.com.brunohdz.leccion03.Servicios;

import mx.com.brunohdz.leccion03.Dominio.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar (Persona persona);

    public void eliminar (Persona persona);

    public Persona encontrarPersona (Persona persona);

}
