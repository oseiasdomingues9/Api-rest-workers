package com.rpg.APIRestRPG.repositories;

import com.rpg.APIRestRPG.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
