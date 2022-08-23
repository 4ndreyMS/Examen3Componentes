package com.cenfotec.examen.repositories;

import com.cenfotec.examen.domain.Hijo;
import com.cenfotec.examen.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositoy  extends JpaRepository<Libro, Long> {
}
