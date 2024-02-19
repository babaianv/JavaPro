package de.aittr.g_31_2_rest.controllers;

import de.aittr.g_31_2_rest.domain.Parrot;
import de.aittr.g_31_2_rest.services.ParrotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parrots")
public class ParrotController {

    private ParrotService parrotService;

    public ParrotController(ParrotService parrotService) {
        this.parrotService = parrotService;
    }

    @GetMapping
    public List<Parrot> getAll(){
        return parrotService.getAll();
    }

    @GetMapping("/{id}")
    public Parrot getById(@PathVariable int id){
        return parrotService.getById(id);
    }

    @PostMapping
    public Parrot save(@RequestBody Parrot parrot){
        return parrotService.save(parrot);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        parrotService.deleteById(id);
    }
}
