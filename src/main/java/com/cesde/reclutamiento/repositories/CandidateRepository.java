package com.cesde.reclutamiento.repositories;

import com.cesde.reclutamiento.domain.Candidate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidateRepository {
    // Simulación de base de datos en memoria
    public List<Candidate> lista = new ArrayList<>();

    // Paso 2: Método save(objeto) que agrega a la lista
    public void save(Candidate candidate) {
        lista.add(candidate);
    }

    // Paso 2: Método findById(int id) que busca usando stream
    public Candidate findById(int id) {
        return lista.stream()
                .filter(c -> c.getId() != null && c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
