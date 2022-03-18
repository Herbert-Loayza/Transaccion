package com.bootcamp.servicetransaccion.controller;

import com.bootcamp.servicetransaccion.entity.Deposito;
import com.bootcamp.servicetransaccion.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/deposito")
public class DepositoController {

    @Autowired
    private DepositoService depositoService;


    @GetMapping
    public Flux<Deposito>findAll(){
        return depositoService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Deposito> findById(@PathVariable String id) {
        return depositoService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Deposito> save(@RequestBody Deposito deposito) {
        return depositoService.save(deposito);
    }

    @PutMapping
    public Mono<Deposito> put(@RequestBody Deposito deposito) {
        return depositoService.save(deposito);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return depositoService.deleteById(id);
    }

}
