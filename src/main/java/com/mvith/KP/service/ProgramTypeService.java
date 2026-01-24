package com.mvith.KP.service;

import java.util.List;

import com.mvith.KP.model.ProgramType;
import com.mvith.KP.repository.ProgramTypeRepository;

public class ProgramTypeService {
    private final ProgramTypeRepository programTypeRepository;

    public ProgramTypeService(ProgramTypeRepository programTypeRepository) {
        this.programTypeRepository = programTypeRepository;
    }

    // GET all types /programType
    public List<ProgramType> getAllProgramTypes() {
        return programTypeRepository.findAll();
    }

    // GET a type /programType/{id}
    public ProgramType getOneProgramType(Long id) {
        return programTypeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Program Type not found"));
    }

}
