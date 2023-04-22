package com.anec.conacyt.rest;


import com.anec.conacyt.modelo.CatAcciMici;
import com.anec.conacyt.repositorios.AcciMiciRepository;
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
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author joel.sandoval
 */
@RestController
@RequestMapping(value = "acci_mici")
class AcciMiciREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcciMiciREST.class);

    @Autowired
    private AcciMiciRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CatAcciMici create(@RequestBody CatAcciMici resource) {
        CatAcciMici resulta = repository.save(resource);
        return resulta;
    }
    
    @GetMapping(value = "/listado")
    @ResponseBody
    public List<CatAcciMici> dameCatAcciMici() {
        return repository.dameCatAcciMici();
    }


}

