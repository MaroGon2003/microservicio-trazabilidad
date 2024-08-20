package com.example.microservicio_trazabilidad.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TraceabilityDto {

    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private String date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;

}
