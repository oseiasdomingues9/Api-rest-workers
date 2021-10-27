package com.rpg.APIRestRPG.controller;

import com.rpg.APIRestRPG.dto.WorkerDTO;
import com.rpg.APIRestRPG.model.Worker;
import com.rpg.APIRestRPG.services.WorkerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api/workers")
@RestController
public class WorkerController {
    @Autowired
    WorkerService workerService;
    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<WorkerDTO>> findAll(){
        List<Worker> list = workerService.findAll();
        List<WorkerDTO> listDTO = list
                .stream()
                .map(x -> forDTO(x))
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(listDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<WorkerDTO> findById(@PathVariable Long id){
        Worker obj = workerService.findById(id);
        WorkerDTO objDTO = forDTO(obj);
        return ResponseEntity.status(HttpStatus.OK).body(objDTO);
    }
    @PostMapping
    public ResponseEntity<Worker> insert(@RequestBody WorkerDTO workerDTO){
        Worker worker = forObj(workerDTO);
        Worker obj = workerService.insert(worker);
        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }

    /*METODOS*/
    public WorkerDTO forDTO(Worker obj){
        return modelMapper.map(obj, WorkerDTO.class);
    }

    public Worker forObj(WorkerDTO objDTO){
        return modelMapper.map(objDTO, Worker.class);
    }
}
