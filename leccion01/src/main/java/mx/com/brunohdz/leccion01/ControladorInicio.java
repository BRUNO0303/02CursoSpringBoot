package mx.com.brunohdz.leccion01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j

public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model){
        // Manda mensaje en forma index
        var mensaje = "Mensaje con Thymeleaf";
        model.addAttribute("mensaje", mensaje);

        // Manda parametros de la clase Persona al index
        Persona persona = new Persona();
        persona.setNombre("Bruno");
        persona.setApellido("Hernandez");
        persona.setTelefono("5513572541");
        model.addAttribute("persona", persona);

        // Manda parametros de la clase Persona 2 al index
        Persona persona2 = new Persona();
        persona2.setNombre("Pau");
        persona2.setApellido("Ovando");
        persona2.setTelefono("55198755");

        // Guardamos las personas en un arrayList
//        var personas = new ArrayList<>();
//        personas.add(persona);
//        personas.add(persona2);
        // Segunda forma de crear arraylist
        var personas = Arrays.asList(persona,persona2);
        // Mandamos el modelo
        model.addAttribute("personas", personas);
        log.info("Ejecutando Inicio");
        return "index";
    }
}
