package com.cesde.reclutamiento.services;

import com.cesde.reclutamiento.domain.Candidate;

public interface CandidateService {
    void create(Candidate candidate);
    Candidate getById(int id);
}
