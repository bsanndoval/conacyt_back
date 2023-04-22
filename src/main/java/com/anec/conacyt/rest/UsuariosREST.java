package com.anec.conacyt.rest;


import com.anec.conacyt.modelo.Usuarios;
import com.anec.conacyt.repositorios.UsuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author joel.sandoval
 */
@RestController
@RequestMapping(value = "usuarios")
class UsuariosREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuariosREST.class);

    @Autowired
    private UsuariosRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Usuarios create(@RequestBody Usuarios resource) {
        Usuarios resulta = repository.save(resource);
        return resulta;
    }

    @GetMapping(value = "/listado")
    @ResponseBody
    public Iterable<Usuarios> dameUsuarios() {
        return repository.findAll();
    }

    @GetMapping(value = "/listado/{usuario}")
    @ResponseBody
    public List<Usuarios> dameUsuariosUsuario(@PathVariable("usuario") Integer usuario) {
        return repository.dameUsuariosUsuario(usuario);
    }

}
