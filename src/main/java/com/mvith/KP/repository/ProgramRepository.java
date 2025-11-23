package com.mvith.KP.repository;

import com.mvith.KP.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {
    
}
