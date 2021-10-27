package com.rpg.APIRestRPG.services;

import com.rpg.APIRestRPG.model.Worker;
import com.rpg.APIRestRPG.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    WorkerRepository workerRepository;

    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    public Worker findById(Long id){
        return workerRepository.findById(id).orElseThrow(()-> new NullPointerException());
    }

    public Worker insert(Worker worker){
        return workerRepository.save(worker);
    }
}
