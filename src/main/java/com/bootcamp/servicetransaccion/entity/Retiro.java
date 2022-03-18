package com.bootcamp.servicetransaccion.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "retiro")
public class Retiro {

    @Id
    private String id;
}
