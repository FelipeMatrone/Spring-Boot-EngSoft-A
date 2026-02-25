package com.am.school.repositories;

import com.am.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <AlunoModel, Long>  {
}
