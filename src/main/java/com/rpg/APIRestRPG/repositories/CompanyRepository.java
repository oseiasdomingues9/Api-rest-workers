package com.rpg.APIRestRPG.repositories;

import com.rpg.APIRestRPG.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
