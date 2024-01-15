package de.aittr.g_31_2_restHW5.controllers;


import de.aittr.g_31_2_restHW5.domain.Dog;
import de.aittr.g_31_2_restHW5.services.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {

    private DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    };

    @GetMapping
    public List<Dog> getAll(){
        return dogService.getAll();
    }

    @GetMapping("/get")
    public Dog getById(@RequestParam int id) {
        return dogService.getById(id);
    }
}
