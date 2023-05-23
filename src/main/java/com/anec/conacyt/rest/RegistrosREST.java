package com.anec.conacyt.rest;


import com.anec.conacyt.modelo.Registros;
import com.anec.conacyt.modelo.view.VwRegistros;
import com.anec.conacyt.modelo.view.VwCostosEtapa;
import com.anec.conacyt.repositorios.RegistrosRepository;
import com.anec.conacyt.repositorios.view.VwRegistrosRepository;
import com.anec.conacyt.repositorios.view.VwCostosEtapaRepository;
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
    private RegistrosRepository repo;
    
    @Autowired
    private VwRegistrosRepository vwRepo;
    
    @Autowired
    private VwCostosEtapaRepository vwCostos;
     
   
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
      
    public Registros create(@RequestBody Registros resource) {
        Registros resulta = repo.save(resource);
        return resulta;
    }
   
    @GetMapping(value = "/bitacora/{parcela}")
    @ResponseBody
    public List<VwRegistros> dameRegistrosParcela(@PathVariable("parcela") Integer parcela) {
        return vwRepo.dameRegistrosParcela(parcela);
    }
    
    
  @GetMapping(value = "/costosEtapa/{parcela}")
    @ResponseBody
    public List<VwCostosEtapa> dameCostosEtapa(@PathVariable("parcela") Integer parcela) {
        return vwCostos.dameCostosEtapa(parcela);
    }
    
   
    @GetMapping(value = "/delete/{registro}")
    public void delRegistro(@PathVariable("registro") Integer registro) {
        repo.deleteById(registro);
    } 
     

}

