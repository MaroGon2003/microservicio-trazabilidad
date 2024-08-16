package com.example.microservicio_trazabilidad.domain.api;

import com.example.microservicio_trazabilidad.domain.model.TraceabilityModel;

import java.util.List;

public interface ITraceabilityServicePort {

    void saveTraceability(TraceabilityModel traceabilityModel);

    List<TraceabilityModel> getTraceabilityHistory(Long customerId);

}
