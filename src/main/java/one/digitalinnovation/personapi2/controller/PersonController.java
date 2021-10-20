package one.digitalinnovation.personapi2.controller;

import one.digitalinnovation.personapi2.dto.MessageResponseDTO;
import one.digitalinnovation.personapi2.entity.Person;
import one.digitalinnovation.personapi2.repository.PersonRepository;
import one.digitalinnovation.personapi2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Controlador que vai ser acessado a partir de uma API REST
@RestController
@RequestMapping("/api/v1/people") // Caminho de acesso da API
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
