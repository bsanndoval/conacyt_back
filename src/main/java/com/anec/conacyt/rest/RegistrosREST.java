package com.anec.conacyt.rest;


import com.anec.conacyt.modelo.Predios;
import com.anec.conacyt.modelo.Registros;
import com.anec.conacyt.repositorios.RegistrosRepository;
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
@RequestMapping(value = "registros")
class RegistrosREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrosREST.class);

    @Autowired
    private RegistrosRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Registros create(@RequestBody Registros resource) {
        Registros resulta = repository.save(resource);
        return resulta;
    }
    
    @GetMapping(value = "/listado")
    @ResponseBody
    public List<Registros> dameRegistros() {
        return repository.dameRegistros();
    }
    
    @GetMapping(value = "/bitacora/{parcela}")
    @ResponseBody
    public List<Registros> dameRegistrosParcela(@PathVariable("parcela") Integer parcela) {
        return repository.dameRegistrosParcela(parcela);
    }

}

