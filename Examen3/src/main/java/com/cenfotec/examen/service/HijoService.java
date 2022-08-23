package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Adulto;
import com.cenfotec.examen.domain.Hijo;

import java.util.List;
import java.util.Optional;

public interface HijoService {
    public Optional<Hijo> save(Hijo hijo);
    public List<Hijo> getAll();
    public Optional<Hijo> getById (long id);
}
