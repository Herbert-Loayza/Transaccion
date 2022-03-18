package com.bootcamp.servicetransaccion.service.serviceImpl;

import com.bootcamp.servicetransaccion.entity.Deposito;
import com.bootcamp.servicetransaccion.repository.DepositoRepository;
import com.bootcamp.servicetransaccion.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DepositoServiceImpl implements DepositoService {

    @Autowired
    private DepositoRepository depositoRepository;


    public Flux<Deposito> findAll() {
        return depositoRepository.findAll();
    }

    public Mono<Deposito> findById(String id) {
        return depositoRepository.findById(id);
    }

    public Mono<Deposito> save(Deposito deposito) {
        return depositoRepository.save(deposito);
    }

    public Mono<Void> deleteById(String id) {
        return depositoRepository.deleteById(id);
    }
}
