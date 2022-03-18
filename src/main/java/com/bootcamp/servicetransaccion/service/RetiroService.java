package com.bootcamp.servicetransaccion.service;

import com.bootcamp.servicetransaccion.entity.Retiro;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RetiroService {

    public Flux<Retiro> findAll();
    public Mono<Retiro> findById(String id);
    public Mono<Retiro>save(Retiro retiro);
    public Mono<Void> deleteById(String id);
}
