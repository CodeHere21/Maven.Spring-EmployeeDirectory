package io.zipcoder.persistenceapp.models;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long departmentId;
    private String firstname;

    @OneToOne
    private Employee departmentManager;

    public Department() {
    }

    public Department(Long departmentId, String firstname, Employee departmentManager) {
        this.departmentId = departmentId;
        this.firstname = firstname;
        this.departmentManager = departmentManager;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }
}
