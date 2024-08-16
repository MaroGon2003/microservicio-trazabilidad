package com.example.microservicio_trazabilidad.domain.spi;

import com.example.microservicio_trazabilidad.domain.model.TraceabilityModel;

import java.util.List;

public interface ITraceabilityPersistencePort {

    void saveTraceability(TraceabilityModel traceabilityModel);

    List<TraceabilityModel> getTraceabilityHistory(Long customerId);

}
