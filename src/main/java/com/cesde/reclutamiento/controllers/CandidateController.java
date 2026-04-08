package com.cesde.reclutamiento.controllers;

import com.cesde.reclutamiento.domain.Candidate;
import com.cesde.reclutamiento.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    // Paso 4: Inyecta la Interface del servicio
    @Autowired
    private CandidateService candidateService;

    // Endpoint de tipo @PostMapping("/create")
    @PostMapping("/create")
    public String create(@RequestBody Candidate candidate) {
        candidateService.create(candidate);
        return "Candidato registrado exitosamente en el sistema de reclutamiento";
    }

    // Endpoint de tipo @GetMapping("/{id}")
    @GetMapping("/{id}")
    public Candidate getById(@PathVariable int id) {
        return candidateService.getById(id);
    }
}
