package com.cenfotec.examen.service;


import com.cenfotec.examen.domain.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {
    public Libro save(Libro libro);
    public List<Libro> getAll();

    public Optional<Libro> getLibro(long id);
}
