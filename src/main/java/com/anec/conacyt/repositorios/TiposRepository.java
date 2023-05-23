package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.CatAcciMici;
import com.anec.conacyt.modelo.CatTipos;
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
public interface TiposRepository extends CrudRepository<CatTipos, Integer> {

    @Query(value = "select  *\n"
            + "from cat_tipos order by id", nativeQuery = true)
    List<CatTipos> dameCatTipos();

     @Query(value = "select *\n"
            + "FROM cat_tipos where id = :idtip ", nativeQuery = true)
    List<CatTipos> dameTipo(@Param("idtip") Integer idtip);
}
