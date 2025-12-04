package com.mvith.KP.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mvith.KP.model.Organisation;
import com.mvith.KP.repository.OrganisationRepository;

@Service
public class OrganisationService {
    private final OrganisationRepository organisationRepository;

    public OrganisationService(OrganisationRepository organisationRepository) {
        this.organisationRepository = organisationRepository;
    }

    // GET all organisations /org
    public List<Organisation> getOrganisations() {
        return organisationRepository.findAll();
    }

    // GET one organisation /org/{id}
    public Organisation getOneOrganisation(Long id) {
        return organisationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Organisation not found with id: " + id));
    }
    // POST create organisation /org
    public Organisation createOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    // DELETE remove organisation
    public void deleteOrganisation(Long id) {
        organisationRepository.deleteById(id);
    }

    // PATCH update an organisation details /org
    

}
