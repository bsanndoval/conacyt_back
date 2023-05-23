package com.anec.conacyt.repositorios.view;


import com.anec.conacyt.modelo.view.VwCostosEtapa;
import com.anec.conacyt.modelo.view.VwParcelas;
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
public interface VwParcelasRepository extends CrudRepository<VwParcelas, Integer> {
    @Query(value = "select * from vw_parcelas p where p.id_predio = :predio order by p.idtip", nativeQuery = true)
    List<VwParcelas> dameVwParcelasPredio(@Param("predio") Integer predio);
    
     @Query(value = "select * from vw_parcelas p where p.id = :parcela", nativeQuery = true)
    List<VwParcelas> dameVwParcela(@Param("parcela") Integer parcela);
}

