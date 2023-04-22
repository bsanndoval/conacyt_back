package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.Usuarios;
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
public interface UsuariosRepository extends CrudRepository<Usuarios, Integer> {
        
    @Query(value = "SELECT  *\n"
            + "FROM usuarios where id  = :usuario", nativeQuery = true)
    List<Usuarios> dameUsuariosUsuario(@Param("usuario") Integer usuario);

}
