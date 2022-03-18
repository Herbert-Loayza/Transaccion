package com.bootcamp.servicetransaccion.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "deposito")
public class Deposito {

    @Id
    private String id;
}
