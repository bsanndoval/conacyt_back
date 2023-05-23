package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.CatAcciMici;
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
public interface CategoriasRepository extends CrudRepository<CatAcciMici, Integer> {

    @Query(value = "select  *\n"
            + "from cat_acci_mici order by id", nativeQuery = true)
    List<CatAcciMici> dameCatAcciMici();

}
