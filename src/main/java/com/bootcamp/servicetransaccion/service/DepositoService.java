package com.bootcamp.servicetransaccion.service;

import com.bootcamp.servicetransaccion.entity.Deposito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DepositoService {

    public Flux<Deposito>findAll();
    public Mono<Deposito>findById(String id);
    public Mono<Deposito>save(Deposito deposito);
    public Mono<Void> deleteById(String id);
}
