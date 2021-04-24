package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }
    public Iterable<Employee> getAllEmployees() { return repository.findAll();}

    public Employee getEmployee (Long id) { return repository.findOne(id);}

    public Employee createEmployee (Employee employee){ return repository.save(employee);}

    public Employee updateEmployee (Long id, Employee newEmployeeData){
        Employee originalEmployee = repository.findOne(id);
        originalEmployee.setFirstname(newEmployeeData.getFirstname());
        originalEmployee.setPhonenumber(newEmployeeData.getPhonenumber());
        return repository.save(originalEmployee);
    }

    public Boolean deleteEmployee(Long id){
        repository.delete(id);
        return true;
    }
}
