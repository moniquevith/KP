package com.mvith.KP.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mvith.KP.model.Organisation;
import com.mvith.KP.repository.OrganisationRepository;
import com.mvith.KP.dto.OrganisationCreateRequest;
import com.mvith.KP.dto.OrganisationPatchRequest;

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
    public Organisation createOrganisation(OrganisationCreateRequest request) {
        Organisation org = new Organisation();

        org.setDescription(request.getDescription());
        org.setEmail(request.getEmail());
        org.setLocation(request.getEmail());
        org.setName(request.getName());
        org.setPhone_number(request.getPhone_number());
        org.setWebsite(request.getWebsite());
        
        return organisationRepository.save(org);
    }

    // DELETE remove organisation
    public void deleteOrganisation(Long id) {
        organisationRepository.deleteById(id);
    }

    // PATCH update an organisation details /org
    public Organisation updateOrganisation(Long id, OrganisationPatchRequest updates) {
        Organisation org = organisationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Organisation not found with id: " + id));
        
        if (updates.getDescription() != null) {
            org.setDescription(updates.getDescription());
        }

        if (updates.getEmail() != null) {
            org.setEmail(updates.getEmail());
        }

        if (updates.getLocation() != null) {
            org.setLocation(updates.getLocation());
        }

        if (updates.getName() != null) {
            org.setName(updates.getName());
        }

        if (updates.getPhone_number() != null) {
            org.setPhone_number(updates.getPhone_number());
        }

        if (updates.getWebsite() != null) {
            org.setWebsite(updates.getWebsite());
        }

        return organisationRepository.save(org);
    }

}
