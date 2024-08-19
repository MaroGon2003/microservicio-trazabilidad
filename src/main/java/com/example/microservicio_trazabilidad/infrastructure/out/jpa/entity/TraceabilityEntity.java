package com.example.microservicio_trazabilidad.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "traceability")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TraceabilityEntity {

    @Id
    private String id;

    @Field
    private Long orderId;
    @Field
    private Long customerId;
    @Field
    private String customerEmail;
    @Field
    private LocalDateTime date;
    @Field
    private String previousStatus;
    @Field
    private String newStatus;
    @Field
    private Long employeeId;
    @Field
    private String employeeEmail;
}
