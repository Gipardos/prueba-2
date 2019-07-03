
package com.lp2.prueba2.clinica.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Marcelo Esperguel
 */
@Controller
public class MedicoController {
    
    @GetMapping("/")
    public String index(){
        
        return "index";
    }
}
