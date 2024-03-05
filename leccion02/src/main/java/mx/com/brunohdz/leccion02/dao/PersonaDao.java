package mx.com.brunohdz.leccion02.dao;


import mx.com.brunohdz.leccion02.dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
