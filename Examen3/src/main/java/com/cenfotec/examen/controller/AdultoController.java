package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Adulto;
import com.cenfotec.examen.service.AdultoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/adulto"})
public class AdultoController {

    @Autowired
    private AdultoService adultoService;


    @GetMapping
    public List getAll(){
        return adultoService.getAll();
    }

    @PostMapping
    public Adulto create(@RequestBody Adulto adulto){
        return adultoService.save(adulto).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Adulto> update(@PathVariable("id") long id, @RequestBody Adulto adulto){
        adulto.setId(id);

        Optional<Adulto> result = adultoService.update(adulto);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/getBy")
    public List<Adulto> findBy(@RequestBody Adulto adulto){

        try{
            List<Adulto> result = adultoService.findBy(adulto);
            if (result != null){
                return result;
            }
        }catch (Exception e){
            return Collections.emptyList();
        }
        return Collections.emptyList();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Adulto> getById(@PathVariable long id){
        Optional<Adulto> result = adultoService.getById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
