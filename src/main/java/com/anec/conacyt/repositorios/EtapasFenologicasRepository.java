package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.CatEtapasFenologicas;
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
public interface EtapasFenologicasRepository extends CrudRepository<CatEtapasFenologicas, Integer> {

    @Query(value = "select  *\n"
            + "from cat_etapas_fenologicas order by id", nativeQuery = true)
    List<CatEtapasFenologicas> dameEtapasFenologicas();

}
