package com.mvith.KP.service;

import org.springframework.stereotype.Service;

import com.mvith.KP.repository.OrganisationRepository;

@Service
public class OrganisationService {
    private final OrganisationRepository organisationRepository;

    public OrganisationService(OrganisationRepository organisationRepository) {
        this.organisationRepository = organisationRepository;
    }

    // GET all organisations /org
    // GET one organisation /org/{id}
    // POST create organisation /org
    // PATCH update an organisation details /org
    // DELETE remove organisation
}
