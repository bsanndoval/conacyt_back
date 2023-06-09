package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.Registros;

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
public interface RegistrosRepository extends CrudRepository<Registros, Integer> {

    @Query(value = "select  *\n"
            + "from registros order by id", nativeQuery = true)
    List<Registros> dameRegistros();
    
    
    @Query(value = "select r.id, r.id_parcela, p.tipo as idtip, r.etapa, ct.tipo, e.etap as etapaF,\n"
            + "	r.fecha, r.actividad, r.categoria, a.categoria as categoriaF,\n"
            + "	r.arvenses, r.practica, cp.practica as practicaF,\n"
            + "	r.unidad, u.unidad as unidadF,\n"
            + "	r.cantidad, r.precio, r.incidencias, r.observaciones, r.muestreo\n"
            + " from\n"
            + "	registros r\n"
            + " inner join parcelas p on p.id = r.id_parcela\n"
            + " inner join cat_etapas_fenologicas e on e.id = r.etapa\n"
            + " inner join cat_acci_mici a on a.id = r.categoria\n"
            + " inner join cat_practicas cp on cp.id = r.practica\n"
            + " inner join cat_unidades u on u.id = r.unidad\n"
            + " inner join cat_tipos ct on ct.id = p.tipo\n"
            + " where r.id_parcela = :parcela", nativeQuery = true)
    List<Registros> dameRegistrosParcela(@Param("parcela") Integer parcela);
  
    
        
    
}