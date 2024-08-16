package com.example.microservicio_trazabilidad.infrastructure.out.jpa.adapter;

import com.example.microservicio_trazabilidad.domain.model.TraceabilityModel;
import com.example.microservicio_trazabilidad.domain.spi.ITraceabilityPersistencePort;
import com.example.microservicio_trazabilidad.infrastructure.out.jpa.mapper.ITraceabilityEntityMapper;
import com.example.microservicio_trazabilidad.infrastructure.out.jpa.repository.ITraceabilityRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TraceabilityMongodbAdapter implements ITraceabilityPersistencePort {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Override
    public void saveTraceability(TraceabilityModel traceabilityModel) {
        traceabilityRepository.save(traceabilityEntityMapper.toCollection(traceabilityModel));
    }

    @Override
    public List<TraceabilityModel> getTraceabilityHistory(Long customerId) {
        return traceabilityEntityMapper.toModelList(
                traceabilityRepository.findByCustomerId(customerId));
    }
}
