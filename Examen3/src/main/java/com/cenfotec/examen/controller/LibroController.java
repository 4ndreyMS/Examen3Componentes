package com.cenfotec.examen.controller;


import com.cenfotec.examen.domain.Hijo;
import com.cenfotec.examen.domain.Libro;
import com.cenfotec.examen.service.HijoService;
import com.cenfotec.examen.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/libro"})
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public Libro create(@RequestBody Libro libro){
        return libroService.save(libro);
    }

    @GetMapping
    public List getAll(){
        return libroService.getAll();
    }



}
