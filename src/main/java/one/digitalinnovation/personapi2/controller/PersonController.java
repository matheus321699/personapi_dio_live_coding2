package one.digitalinnovation.personapi2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controlador que vai ser acessado a partir de uma API REST
@RestController
@RequestMapping("/api/v1/people") // Caminho de acesso da API
public class PersonController {

    @GetMapping
    public String getBook() {
        return  "API Test";
    }
}
