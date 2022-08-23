package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Adulto;

import java.util.List;
import java.util.Optional;

public interface AdultoService {
    public Optional<Adulto> save(Adulto adulto);
    public Optional<Adulto> update(Adulto adulto);
    public List<Adulto> findBy(Adulto adulto);
    public List<Adulto> getAll();

    public Optional<Adulto> getById (long id);

}

