package com.anec.conacyt.rest;

import com.anec.conacyt.modelo.Parcelas;
import com.anec.conacyt.modelo.view.VwParcelas;
import com.anec.conacyt.repositorios.ParcelasRepository;
import com.anec.conacyt.repositorios.view.VwParcelasRepository;
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
@RequestMapping(value = "parcelas")
class ParcelasREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParcelasREST.class);

    @Autowired
    private ParcelasRepository repository;
    
     @Autowired
    private VwParcelasRepository vwParcelas;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Parcelas create(@RequestBody Parcelas resource) {
        Parcelas resulta = repository.save(resource);
        return resulta;
    }

    @GetMapping(value = "/listado")
    @ResponseBody
    public List<Parcelas> dameParcelas() {
        return repository.dameParcelas();
    }

    @GetMapping(value = "{id}")
    @ResponseBody
    public List<Parcelas> dameParcela(@PathVariable("id") Integer id) {
        return repository.dameParcela(id);
    }
    @GetMapping(value = "/listado/{predio}")
    @ResponseBody
    public List<Parcelas> dameParcelasPredio(@PathVariable("predio") Integer predio) {
        return repository.dameParcelasPredio(predio);
    }
    
    @GetMapping(value = "/parcelasvw/{predio}")
    @ResponseBody
    public List<VwParcelas> dameVwParcelasPredio(@PathVariable("predio") Integer predio) {
        return vwParcelas.dameVwParcelasPredio(predio);
        
        
    }
    
    @GetMapping(value = "/parcelavw/{parcela}")
    @ResponseBody
    public List<VwParcelas> dameVwParcela(@PathVariable("parcela") Integer parcela) {
        return vwParcelas.dameVwParcela(parcela);
        
        
    }

}

