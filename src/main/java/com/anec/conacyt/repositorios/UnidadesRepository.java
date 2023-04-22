package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.CatUnidades;
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
public interface UnidadesRepository extends CrudRepository<CatUnidades, Integer> {

    @Query(value = "select  *\n"
            + "from cat_unidades order by id", nativeQuery = true)
    List<CatUnidades> dameUnidades();

}
