/*
package com.cenfotec.examen.mutation;

import com.cenfotec.examen.domain.Libro;
import com.cenfotec.examen.service.LibroService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LibroMutation implements GraphQLMutationResolver {

    @Autowired
    private LibroService libroService;

    public Libro createLibro(String nombre, String descripcion, int hijo){
        Libro libro = new Libro(nombre, descripcion, false, hijo);
        return this.libroService.save(libro);
    }

    public void updateLibro(long id,String nombre, String descripcion, long hijo){
        Optional<Libro> libro = libroService.getLibro(id);
        if (libro.isPresent()){
            Libro libroUpd = libro.get();
            libroUpd.setNombre(nombre);
            libroUpd.setDescripcion(descripcion);
            libroUpd.setHijo(hijo);
            libroService.save(libroUpd);
        }
    }



}
*/
