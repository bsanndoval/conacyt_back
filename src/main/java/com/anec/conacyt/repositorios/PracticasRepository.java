package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.CatPracticas;
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
public interface PracticasRepository extends CrudRepository<CatPracticas, Integer> {

    @Query(value = "select  *\n"
            + "from cat_practicas order by id", nativeQuery = true)
    List<CatPracticas> dameCatPracticas();

}
