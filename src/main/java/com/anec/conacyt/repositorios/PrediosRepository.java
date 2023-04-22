package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.Predios;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joel.sandoval
 */
@Repository
public interface PrediosRepository extends CrudRepository<Predios, Integer> {

    @Query(value = "select  *\n"
            + "from predios order by id", nativeQuery = true)
    List<Predios> damePredios();

    @Query(value = "SELECT  *\n"
            + "FROM predios where id_usuario  = :usuario order by id;", nativeQuery = true)
    List<Predios> damePrediosUsuario(@Param("usuario") Integer usuario);

    @Query(value = "SELECT  *\n"
            + "FROM predios where id  = :id_predio order by id;", nativeQuery = true)
    List<Predios> damePredio(@Param("id_predio") Integer id_predio);

    
}
