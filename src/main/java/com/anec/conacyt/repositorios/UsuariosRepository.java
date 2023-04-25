package com.anec.conacyt.repositorios;

import com.anec.conacyt.modelo.Usuarios;
import java.util.List;
import java.util.Optional;
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

    @Query(value = "select * from usuarios where usuario = :usuario and passw = :passw", nativeQuery = true)
    Optional<Usuarios> login(@Param("usuario") String usuario, @Param("passw") String passw);

}
