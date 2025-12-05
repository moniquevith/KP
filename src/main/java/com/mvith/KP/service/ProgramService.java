package com.mvith.KP.service;

import java.util.List;

import com.mvith.KP.model.Program;
import com.mvith.KP.repository.ProgramRepository;

public class ProgramService {
    private final ProgramRepository programRepository;

    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    // GET all programs /program
    public List<Program> getPrograms() {
        return programRepository.findAll();
    }
    // GET one program /program/{id}
    public Program getOneProgram(Long id) {
        return programRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Program not found"));
    }

    // GET all programs in org /org/{id}/program
    public List<Program> getAllProgramsInOrg(Long orgId) {
        return programRepository.findByOrgId(orgId);
    }

    // POST create program /program
    // PATCH update program /program
    // DELETE remove program /program
}
