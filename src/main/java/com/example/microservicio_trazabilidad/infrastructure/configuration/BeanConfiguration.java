package com.example.microservicio_trazabilidad.infrastructure.configuration;

import com.example.microservicio_trazabilidad.domain.api.ITraceabilityServicePort;
import com.example.microservicio_trazabilidad.domain.spi.ITraceabilityPersistencePort;
import com.example.microservicio_trazabilidad.domain.useCase.TraceabilityUseCase;
import com.example.microservicio_trazabilidad.infrastructure.out.jpa.adapter.TraceabilityMongodbAdapter;
import com.example.microservicio_trazabilidad.infrastructure.out.jpa.mapper.ITraceabilityEntityMapper;
import com.example.microservicio_trazabilidad.infrastructure.out.jpa.repository.ITraceabilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort() {
        return new TraceabilityMongodbAdapter(traceabilityRepository, traceabilityEntityMapper);
    }

    @Bean
    public ITraceabilityServicePort traceabilityServicePort() {
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }

}
