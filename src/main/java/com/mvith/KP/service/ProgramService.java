package com.mvith.KP.service;

import com.mvith.KP.repository.ProgramRepository;

public class ProgramService {
    private final ProgramRepository programRepository;

    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    // GET all programs /program
    // GET one program /program/{id}
    // GET all programs in org /org/{id}/program
    // POST create program /program
    // PATCH update program /program
    // DELETE remove program /program
}
