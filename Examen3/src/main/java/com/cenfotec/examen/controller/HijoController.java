package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Adulto;
import com.cenfotec.examen.domain.Hijo;
import com.cenfotec.examen.service.HijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/hijo"})
public class HijoController {

    @Autowired
    private HijoService hijoService;

    @PostMapping
    public Hijo create(@RequestBody Hijo hijo){
        return hijoService.save(hijo).get();
    }

    @GetMapping
    public List getAll(){
        return hijoService.getAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Hijo> getById(@PathVariable long id){
        Optional<Hijo> result = hijoService.getById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
