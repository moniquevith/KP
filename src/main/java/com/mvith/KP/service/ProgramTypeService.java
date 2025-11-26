package com.mvith.KP.service;

import com.mvith.KP.repository.ProgramTypeRepository;

public class ProgramTypeService {
    private final ProgramTypeRepository programTypeRepository;

    public ProgramTypeService(ProgramTypeRepository programTypeRepository) {
        this.programTypeRepository = programTypeRepository;
    }

    // GET all types /programType
    // GET a type /programType/{id}
    // GET all programs of a single type /program/programType/{id}
}
