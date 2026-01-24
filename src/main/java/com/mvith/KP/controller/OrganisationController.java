package com.mvith.KP.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvith.KP.dto.OrganisationCreateRequest;
import com.mvith.KP.dto.OrganisationPatchRequest;
import com.mvith.KP.model.Organisation;
import com.mvith.KP.service.OrganisationService;
import com.mvith.KP.service.ProgramService;
import com.mvith.KP.model.Program;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/org")
public class OrganisationController {
    private final OrganisationService organisationService;
    private final ProgramService programService;

    public OrganisationController(OrganisationService organisationService, ProgramService programService) {
        this.organisationService = organisationService;
        this.programService = programService;
    }

    // GET all organisations /org
    @GetMapping
    public List<Organisation> getAllOrganisations() {
        return organisationService.getOrganisations();
    }
    
    // GET one organisation /org/{id}
    @GetMapping("/{id}")
    public Organisation getOneOrganisation(@PathVariable Long id) {
        return organisationService.getOneOrganisation(id);
    }

    // POST create organisation /org
    @PostMapping
    public Organisation postOrganisation(@RequestBody OrganisationCreateRequest organisation) {
        return organisationService.createOrganisation(organisation);
    }
    
    // DELETE remove organisation
    @DeleteMapping("/{id}")
    public void deleteOrganisation(@PathVariable Long id) {
        organisationService.deleteOrganisation(id);
    }

    // PATCH update an organisation details /org
    @PatchMapping("/{id}")
    public Organisation patchOrganisation(@PathVariable Long id, @RequestBody OrganisationPatchRequest request) {
        return organisationService.updateOrganisation(id, request);
    }

    // GET all program in org /org/{id}/program
    @GetMapping("/{id}/program")
    public List<Program> getAllProgramInOrg(@PathVariable Long org_id) {
        return programService.getAllProgramsInOrg(org_id);
    }
}
