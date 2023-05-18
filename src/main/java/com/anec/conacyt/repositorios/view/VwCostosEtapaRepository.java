package com.anec.conacyt.repositorios.view;


import com.anec.conacyt.modelo.view.VwCostosEtapa;
import com.anec.conacyt.modelo.view.VwRegistros;


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
public interface VwCostosEtapaRepository extends CrudRepository<VwCostosEtapa, Integer> {
    @Query(value = "select * from vw_costos_etapa ce where ce.id_parcela = :parcela order by etapa", nativeQuery = true)
    List<VwCostosEtapa> dameCostosEtapa(@Param("parcela") Integer parcela);
}