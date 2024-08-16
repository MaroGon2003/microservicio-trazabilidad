package com.example.microservicio_trazabilidad.domain.useCase;

import com.example.microservicio_trazabilidad.domain.api.ITraceabilityServicePort;
import com.example.microservicio_trazabilidad.domain.model.TraceabilityModel;
import com.example.microservicio_trazabilidad.domain.spi.ITraceabilityPersistencePort;

import java.util.List;

public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    @Override
    public void saveTraceability(TraceabilityModel traceabilityModel) {
        traceabilityPersistencePort.saveTraceability(traceabilityModel);
    }

    @Override
    public List<TraceabilityModel> getTraceabilityHistory(Long customerId) {
        return traceabilityPersistencePort.getTraceabilityHistory(customerId);
    }
}
