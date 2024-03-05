package mx.com.brunohdz.leccion02.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.brunohdz.leccion02.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class Controlador {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model){
        String p1 = "Muestra de texto con controlador y muestro de personas con DAO";
        model.addAttribute("p1", p1);

        var personas = personaDao.findAll();
        model.addAttribute("personas", personas);

        return "index";
    }
}
