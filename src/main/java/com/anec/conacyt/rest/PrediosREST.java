package com.anec.conacyt.rest;

import com.anec.conacyt.modelo.Predios;
import com.anec.conacyt.repositorios.PrediosRepository;
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
@RequestMapping(value = "predios")
class PrediosREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrediosREST.class);

    @Autowired
    private PrediosRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Predios create(@RequestBody Predios resource) {
        Predios resulta = repository.save(resource);
        return resulta;
    }

    @GetMapping(value = "/listado")
    @ResponseBody
    public List<Predios> damePredios() {
        return repository.damePredios();
    }

    @GetMapping(value = "/listado/{usuario}")
    @ResponseBody
    public List<Predios> damePrediosUsuario(@PathVariable("usuario") Integer usuario) {
        return repository.damePrediosUsuario(usuario);
    }
    
    @GetMapping(value = "{id_predio}")
    @ResponseBody
    public List<Predios> damePredio(@PathVariable("id_predio") Integer id_predio) {
        return repository.damePredio(id_predio);
    }

}
