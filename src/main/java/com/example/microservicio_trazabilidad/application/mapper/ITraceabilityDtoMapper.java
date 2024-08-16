package com.example.microservicio_trazabilidad.application.mapper;

import com.example.microservicio_trazabilidad.application.dto.TraceabilityDto;
import com.example.microservicio_trazabilidad.domain.model.TraceabilityModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityDtoMapper {

    TraceabilityModel toModel(TraceabilityDto traceabilityDto);
    TraceabilityDto toDto(TraceabilityModel traceabilityModel);
    List<TraceabilityDto> toDtoList(List<TraceabilityModel> traceabilityModelList);

}
