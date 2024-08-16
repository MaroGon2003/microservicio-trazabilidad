package com.example.microservicio_trazabilidad.application.handler.impl;

import com.example.microservicio_trazabilidad.application.dto.TraceabilityDto;
import com.example.microservicio_trazabilidad.application.handler.ITraceabilityHandler;
import com.example.microservicio_trazabilidad.application.mapper.ITraceabilityDtoMapper;
import com.example.microservicio_trazabilidad.domain.api.ITraceabilityServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TraceabilityHandler implements ITraceabilityHandler {

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityDtoMapper traceabilityDtoMapper;

    @Override
    public void saveTraceability(TraceabilityDto traceabilityDto) {
        traceabilityServicePort.saveTraceability(traceabilityDtoMapper.toModel(traceabilityDto));
    }

    @Override
    public List<TraceabilityDto> getTraceabilityHistory(Long customerId) {
        return traceabilityDtoMapper.toDtoList(traceabilityServicePort.getTraceabilityHistory(customerId));
    }
}
