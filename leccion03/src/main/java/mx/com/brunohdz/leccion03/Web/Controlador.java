package mx.com.brunohdz.leccion03.Web;

import lombok.extern.slf4j.Slf4j;
import mx.com.brunohdz.leccion03.Dominio.Persona;
import mx.com.brunohdz.leccion03.Servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class Controlador {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);

        var p1 = "Tabla de personas";
        model.addAttribute("p1", p1);


        log.info("Ejecutando controlador Inicio MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona){
        log.info("Ejecutando controlador Agregar MVC");
        return "modificar";
    }

    @GetMapping("/editar/{idpersona}")
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        log.info("Ejecutando controlador editar MVC");
        return "modificar";
    }

    @GetMapping("/eliminar/{idpersona}")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        log.info("Ejecutando controlador eliminar MVC");
        return "redirect:/";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        log.info("Ejecutando controlador Guardar MVC");
        return "redirect:/";
    }




}
