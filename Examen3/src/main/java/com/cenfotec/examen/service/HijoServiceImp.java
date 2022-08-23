package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Adulto;
import com.cenfotec.examen.domain.Hijo;
import com.cenfotec.examen.repositories.HijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HijoServiceImp implements HijoService{

    @Autowired
    HijoRepository hijoRepo;

    @Override
    public Optional<Hijo> save(Hijo hijo) {
        return Optional.of(hijoRepo.save(hijo));
    }

    @Override
    public List<Hijo> getAll() {
        return hijoRepo.findAll();
    }

    @Override
    public Optional<Hijo> getById(long id) {
        return hijoRepo.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }
}
