package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Adulto;
import com.cenfotec.examen.repositories.AdultoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdultoServiceImp implements AdultoService{

    @Autowired
     AdultoRepository adultoRepo;


    @Override
    public Optional<Adulto> save(Adulto adulto) {
        return Optional.of(adultoRepo.save(adulto));
    }

    @Override
    public Optional<Adulto> update(Adulto adulto) {
        Optional<Adulto> record = adultoRepo.findById(adulto.getId());
        if (record.isPresent()) {
            Adulto data = record.get();
            data.setNombre(adulto.getNombre());
            data.setApellidos(adulto.getApellidos());
            data.setDirection(adulto.getDirection());
            data.setMainPhone(adulto.getMainPhone());
            data.setPhone(adulto.getPhone());
            return Optional.of(adultoRepo.save(data));
        }
        return Optional.empty();
    }


    @Override
    public List<Adulto> getAll() {
        return adultoRepo.findAll();
    }

    @Override
    public List<Adulto> findBy(Adulto adulto) {
        String nom = adulto.getNombre();
        String ape = adulto.getApellidos();

        if (nom.equals("")){
            nom = "nulo";
        }
        if (ape.equals("")){
            ape = "nulo";
        }

        List<Adulto> lista = adultoRepo.findByNombreContainingIgnoreCaseOrApellidosContainingIgnoreCase(nom, ape);

        return lista;
    }

    @Override
    public Optional<Adulto> getById(long id) {
        return adultoRepo.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }
}
