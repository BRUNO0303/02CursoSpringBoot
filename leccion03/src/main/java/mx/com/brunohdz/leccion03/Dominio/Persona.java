package mx.com.brunohdz.leccion03.Dominio;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
