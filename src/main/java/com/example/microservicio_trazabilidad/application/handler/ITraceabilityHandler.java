package com.example.microservicio_trazabilidad.application.handler;

import com.example.microservicio_trazabilidad.application.dto.TraceabilityDto;

import java.util.List;

public interface ITraceabilityHandler {

    void saveTraceability(TraceabilityDto traceabilityDto);

    List<TraceabilityDto> getTraceabilityHistory(Long customerId);
}
