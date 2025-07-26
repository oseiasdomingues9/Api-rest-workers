package com.rpg.APIRestRPG.dto;

import com.rpg.APIRestRPG.model.Company;
import com.rpg.APIRestRPG.model.Worker;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
public class WorkerDTO implements Serializable {



    private static final long serialVersionUID = 3840841225884920061L;

    private String name;
    private Integer age;
    private Integer test01;
    @ManyToOne
    private Company company;

//    public WorkerDTO(Worker worker) {
//        name = worker.getName();
//        age = worker.getAge();
//        company = worker.getCompany();
//    }
//

}
