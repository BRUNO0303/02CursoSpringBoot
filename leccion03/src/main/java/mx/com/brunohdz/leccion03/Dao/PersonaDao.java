package mx.com.brunohdz.leccion03.Dao;

import mx.com.brunohdz.leccion03.Dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
