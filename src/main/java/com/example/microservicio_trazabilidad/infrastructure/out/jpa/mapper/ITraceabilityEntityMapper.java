package com.example.microservicio_trazabilidad.infrastructure.out.jpa.mapper;

import com.example.microservicio_trazabilidad.domain.model.TraceabilityModel;
import com.example.microservicio_trazabilidad.infrastructure.out.jpa.entity.TraceabilityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityEntityMapper {

    TraceabilityModel toModel(TraceabilityEntity traceabilityEntity);
    TraceabilityEntity toCollection(TraceabilityModel traceabilityModel);
    List<TraceabilityModel> toModelList(List<TraceabilityEntity> traceabilityEntityList);

}
