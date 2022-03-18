package com.bootcamp.servicetransaccion.controller;

import com.bootcamp.servicetransaccion.entity.Retiro;
import com.bootcamp.servicetransaccion.service.RetiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/retiro")
public class RetiroController {

    @Autowired
    private RetiroService retiroService;


    @GetMapping
    public Flux<Retiro> findAll(){
        return retiroService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Retiro> findById(@PathVariable String id) {
        return retiroService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Retiro> save(@RequestBody Retiro retiro) {
        return retiroService.save(retiro);
    }

    @PutMapping
    public Mono<Retiro> put(@RequestBody Retiro retiro) {
        return retiroService.save(retiro);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return retiroService.deleteById(id);
    }

}
