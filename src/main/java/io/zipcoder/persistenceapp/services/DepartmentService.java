package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Department;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import org.dom4j.rule.pattern.DefaultPattern;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department create(Department department){
        return repository.save(department);
    }

    public Department updateDepartment (Long id, Department newDepartmentData){
        Department originalDepartment = repository.findOne(id);
        originalDepartment.setDepartmentManager(newDepartmentData
                                                 .getDepartmentManager());
        return repository.save(originalDepartment);
    }

    public Department showDepartment(Long id){
        return repository.findOne(id);
    }
}
