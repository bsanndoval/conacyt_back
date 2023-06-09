package com.anec.conacyt.rest;

import com.anec.conacyt.modelo.CatTipos;
import com.anec.conacyt.modelo.Predios;
import com.anec.conacyt.repositorios.TiposRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author joel.sandoval
 */
@RestController
@RequestMapping(value = "tipos")
class TiposREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(TiposREST.class);

    @Autowired
    private TiposRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CatTipos create(@RequestBody CatTipos resource) {
        CatTipos resulta = repository.save(resource);
        return resulta;
    }
    
    @GetMapping(value = "/listado")
    @ResponseBody
    public List<CatTipos> dameCatTipos() {
        return repository.dameCatTipos();
    }
    
    @GetMapping(value = "{idtip}")
    @ResponseBody
    public List<CatTipos> dameTipo(@PathVariable("idtip") Integer idtip) {
        return repository.dameTipo(idtip);
    }


}

