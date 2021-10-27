package com.rpg.APIRestRPG.config;

import com.rpg.APIRestRPG.model.Worker;
import com.rpg.APIRestRPG.repositories.CompanyRepository;
import com.rpg.APIRestRPG.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class ConfigTest {

    @Autowired
    WorkerRepository workerRepository;
    @Autowired
    CompanyRepository companyRepository;

    @PostConstruct
    public void test(){
        com.rpg.APIRestRPG.model.Company c1 = new com.rpg.APIRestRPG.model.Company(null,"Claro","claro@gmail.com",10000);
        com.rpg.APIRestRPG.model.Company c2 = new com.rpg.APIRestRPG.model.Company(null,"Vivo","vivo@gmail.com",15000);
        com.rpg.APIRestRPG.model.Company c3 = new com.rpg.APIRestRPG.model.Company(null,"Tim","tim@gmail.com",17000);
        com.rpg.APIRestRPG.model.Company c4 = new com.rpg.APIRestRPG.model.Company(null,"OI","oi@gmail.com",13000);


        companyRepository.saveAll(Arrays.asList(c1,c2,c3,c4));

        Worker w1 = new Worker(null,"Winifred Frank",36,"winifredfrank@cablam.com","+1 (962) 457-3822", LocalDate.of(1985,7,23),c1);
        Worker w2 = new Worker(null,"Soto Fulton",40,"sotofulton@aquafire.com","+1 (818) 498-3379", LocalDate.of(1990,7,23),c2);
        Worker w3 = new Worker(null,"Carl Frank",30,"winifredfrank@cablam.com","+1 (962) 457-3822", LocalDate.of(1980,7,23),c3);
        Worker w4 = new Worker(null,"Paul Frank",25,"winifredfrank@cablam.com","+1 (962) 457-3822", LocalDate.of(1970,7,23),c4);

        workerRepository.saveAll(Arrays.asList(w1,w2,w3,w4));

        c1.getWorkers().add(w1);
        c2.getWorkers().add(w2);

        companyRepository.saveAll(Arrays.asList(c1,c2));
    }
}
