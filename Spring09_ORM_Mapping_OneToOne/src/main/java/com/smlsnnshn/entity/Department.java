package com.smlsnnshn.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department extends BaseEntity{

    private String department;
    private String division;

    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department() {
    }

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
