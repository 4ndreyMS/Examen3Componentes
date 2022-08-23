package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Libro;
import com.cenfotec.examen.repositories.LibroRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImp implements LibroService{

    @Autowired
    private LibroRepositoy libroRepo;

    @Override
    public Libro save(Libro libro) {
        return libroRepo.save(libro);
    }

    @Override
    public Optional<Libro>  getLibro(long id) {
        return libroRepo.findById(id);
    }

    @Override
    public List<Libro> getAll() {
        return libroRepo.findAll();
    }

}
