package com.bootcamp.servicetransaccion.repository;

import com.bootcamp.servicetransaccion.entity.Retiro;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RetiroRepository extends ReactiveMongoRepository<Retiro,String> {
}
