package com.anec.conacyt.rest;


import com.anec.conacyt.modelo.CatEtapasFenologicas;
import com.anec.conacyt.repositorios.EtapasFenologicasRepository;
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
@RequestMapping(value = "etapas_fenologicas")
class EtapasFenologicasREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(EtapasFenologicasREST.class);

    @Autowired
    private EtapasFenologicasRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CatEtapasFenologicas create(@RequestBody CatEtapasFenologicas resource) {
        CatEtapasFenologicas resulta = repository.save(resource);
        return resulta;
    }
    
    @GetMapping(value = "/listado")
    @ResponseBody
    public List<CatEtapasFenologicas> dameEtapasFenologicas() {
        return repository.dameEtapasFenologicas();
    }


}

