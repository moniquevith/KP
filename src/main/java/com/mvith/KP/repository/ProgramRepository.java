package com.mvith.KP.repository;

import com.mvith.KP.model.Program;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {
    List<Program> findByOrgId(Long org_id); // SELECT * FROM program WHERE org_id = ?
    List<Program> findbyTypeId(Long type_id); // SELECT * FROM program WHERE type_id = ?
}
