package com.example.microservicio_trazabilidad.infrastructure.input.rest;

import com.example.microservicio_trazabilidad.application.dto.TraceabilityDto;
import com.example.microservicio_trazabilidad.application.handler.ITraceabilityHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
public class TraceabilityRestController {

    private final ITraceabilityHandler traceabilityHandler;

    @PostMapping("/save-traceability")
    public ResponseEntity<Void> saveTraceability(@Valid @RequestBody TraceabilityDto traceabilityDto) {
        traceabilityHandler.saveTraceability(traceabilityDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-traceability-history/{id}")
    public ResponseEntity<List<TraceabilityDto>> getTraceabilityHistory(@PathVariable Long id) {
        return ResponseEntity.ok(traceabilityHandler.getTraceabilityHistory(id));
    }

}
