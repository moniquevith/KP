package com.mvith.KP.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvith.KP.service.ProgramService;
import com.mvith.KP.dto.ProgramCreateRequest;
import com.mvith.KP.dto.ProgramPatchRequest;
import com.mvith.KP.model.Program;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController // returns JSON responses 
@RequestMapping("/program") // sets baseURL for all endpoints so everything starts with /program
public class ProgramController {
    private final ProgramService programService; // declares dependency on service layer

    public ProgramController(ProgramService programService) { // dependency injection
        this.programService = programService;
    }

    // GET all programs /program 
    @GetMapping
    public List<Program> getPrograms() {
        return programService.getPrograms();
    }
    
    // GET a program /program/id
    @GetMapping("/{id}")
    public Program getOneProgram(@PathVariable Long id) {
        return programService.getOneProgram(id);
    }

    // POST create program 
    @PostMapping
    public Program postProgram(@RequestBody ProgramCreateRequest request) {
        return programService.createProgram(request);
    }
    
    // PATCH update program 
    @PatchMapping
    public Program patchProgram(Long id, @RequestBody ProgramPatchRequest request) {
        return programService.patchProgram(id, request);
    }

    // DELETE remove program 
    @DeleteMapping
    public void deleteProgram(Long id) {
        programService.deleteProgram(id);
    }

    // GET all programs of single type /program/programType/{id} 
    @GetMapping("/programType/{id}")
    public List<Program> getProgramsOfSingleType(@PathVariable Long program_type_id) {
        return programService.getAllProgramsOfSingleType(program_type_id);
    }
    
}
