package io.zipcoder.persistenceapp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String title;
    private String phoneNumber;
    private String email;
    private Date hireDate;

    @OneToOne
    private Employee manager;

    @OneToOne
    private Department departmentNumber;

    public Employee() {
    }

    public Employee(Long id, String firstname, String lastname, String title,
                    String phoneNumber, String email, Date hireDate,
                    Employee manager, Department departmentNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.manager = manager;
        this.departmentNumber = departmentNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredate() {
        return hireDate;
    }

    public void setHiredate(Date hiredate) {
        this.hireDate = hiredate;
    }


}
