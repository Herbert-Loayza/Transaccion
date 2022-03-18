package com.bootcamp.servicetransaccion.service.serviceImpl;

import com.bootcamp.servicetransaccion.entity.Retiro;
import com.bootcamp.servicetransaccion.repository.RetiroRepository;
import com.bootcamp.servicetransaccion.service.RetiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RetiroServiceImpl implements RetiroService {

    @Autowired
    private RetiroRepository retiroRepository;

    public Flux<Retiro> findAll() {
        return retiroRepository.findAll();
    }

    public Mono<Retiro> findById(String id) {
        return retiroRepository.findById(id);
    }

    public Mono<Retiro> save(Retiro retiro) {
        return retiroRepository.save(retiro);
    }

    public Mono<Void> deleteById(String id) {
        return retiroRepository.deleteById(id);
    }
}
