package com.example.microservicio_trazabilidad.infrastructure.out.jpa.repository;

import com.example.microservicio_trazabilidad.infrastructure.out.jpa.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, String> {

    List<TraceabilityEntity> findByCustomerId(Long customerId);

}
