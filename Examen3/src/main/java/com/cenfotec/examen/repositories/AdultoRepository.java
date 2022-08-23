package com.cenfotec.examen.repositories;


import com.cenfotec.examen.domain.Adulto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdultoRepository extends JpaRepository<Adulto, Long> {
    List<Adulto> findByNombreContainingIgnoreCaseOrApellidosContainingIgnoreCase(String nom, String ape);
}
