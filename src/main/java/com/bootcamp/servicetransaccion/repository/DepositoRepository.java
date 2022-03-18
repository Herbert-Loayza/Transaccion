package com.bootcamp.servicetransaccion.repository;

import com.bootcamp.servicetransaccion.entity.Deposito;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DepositoRepository extends ReactiveMongoRepository<Deposito,String> {
}
