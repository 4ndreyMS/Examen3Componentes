/*
package com.cenfotec.examen.query;

import com.cenfotec.examen.domain.Libro;
import com.cenfotec.examen.service.LibroService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LibroQuery implements GraphQLQueryResolver {
    @Autowired
    private LibroService libroService;

    */
/*public List<Libro> getLibros(int count){
        return this.libroService.getAllByDeletedIsFalse(count);
    }*//*


    public List<Libro> getAllLibros(int count){
     //   return this.libroService.getAll(count);
        return null;
    }

    public Libro getLibro(int id){
        Optional<Libro> libroOptional = libroService.getLibro(id);
        if(libroOptional.isPresent()){
            return libroOptional.get();
        }else {
            return null;
        }
    }



    public List<Libro> getLibros(){
        return this.libroService.getAll();
    }
}
*/
