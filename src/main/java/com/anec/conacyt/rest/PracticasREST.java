package com.anec.conacyt.rest;


import com.anec.conacyt.modelo.CatPracticas;
import com.anec.conacyt.repositorios.PracticasRepository;
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
@RequestMapping(value = "cat_practicas")
class PracticasREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(PracticasREST.class);

    @Autowired
    private PracticasRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CatPracticas create(@RequestBody CatPracticas resource) {
        CatPracticas resulta = repository.save(resource);
        return resulta;
    }
    
    @GetMapping(value = "/listado")
    @ResponseBody
    public List<CatPracticas> dameCatAcciMici() {
        return repository.dameCatPracticas();
    }


}

