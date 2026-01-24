package com.mvith.KP.service;

import java.util.List;

import com.mvith.KP.dto.ProgramCreateRequest;
import com.mvith.KP.dto.ProgramPatchRequest;
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
    public Program createProgram(ProgramCreateRequest request) {
        Program prog = new Program();

        prog.setAge_max(request.getAge_Max());
        prog.setAge_min(request.getAge_Min());
        prog.setDescription(request.getDescription());
        prog.setName(request.getName());
        prog.setOrg_id(request.getOrgID());
        prog.setType_id(request.getTypeID());

        return programRepository.save(prog);
    }

    // PATCH update program /program
    public Program patchProgram(Long id, ProgramPatchRequest updates) {
        Program prog = programRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Program not found with id: " + id));

        if (updates.getAge_Max() != null) {
            prog.setAge_max(updates.getAge_Max());
        }

        if (updates.getAge_Min() != null) {
            prog.setAge_min(updates.getAge_Min());
        }

        if (updates.getDescription() != null) {
            prog.setDescription(updates.getDescription());
        }

        if (updates.getName() != null) {
            prog.setName(updates.getName());
        }

        if (updates.getOrgID() != null) {
            prog.setOrg_id(updates.getOrgID());
        }

        if (updates.getTypeID() != null) {
            prog.setType_id(updates.getTypeID());
        }

        return programRepository.save(prog);
    }

    // DELETE remove program /program
    public void deleteProgram(Long id) {
        programRepository.deleteById(id);
    }

    // GET all programs of a single type /program/programType/{id} - e.g. all programs that do basketball
    public List<Program> getAllProgramsOfSingleType(Long type_id) {
        return programRepository.findbyTypeId(type_id);
    }
}
