package com.anec.conacyt.repositorios.view;


import com.anec.conacyt.modelo.view.VwRegistros;
import com.anec.conacyt.modelo.Parcelas;

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
public interface VwRegistrosRepository extends CrudRepository<VwRegistros, Integer> {
    @Query(value = "select * from vw_registros r where r.id_parcela = :parcela order by r.etapa, r.fecha", nativeQuery = true)
    List<VwRegistros> dameRegistrosParcela(@Param("parcela") Integer parcela);
}

