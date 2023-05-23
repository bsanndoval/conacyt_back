package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.CatAcciMici;
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
public interface ParcelasRepository extends CrudRepository<Parcelas, Integer> {

    @Query(value = "select  *\n"
            + "from parcelas order by id", nativeQuery = true)
    List<Parcelas> dameParcelas();

    @Query(value = "SELECT  *\n"
            + "FROM parcelas where id_predio  = :predio order by id;", nativeQuery = true)
    List<Parcelas> dameParcelasPredio(@Param("predio") Integer predio);
    
    @Query(value = "SELECT  *\n"
            + "FROM parcelas where id  = :id order by id;", nativeQuery = true)
    List<Parcelas> dameParcela(@Param("id") Integer id);

}
