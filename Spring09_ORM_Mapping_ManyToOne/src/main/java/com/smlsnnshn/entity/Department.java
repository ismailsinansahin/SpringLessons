package com.smlsnnshn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="departments")
public class Department extends BaseEntity{

    private String department;
    private String division;

    @OneToMany(mappedBy = "department")
    private List<Employee> employee;

    public Department() {
    }

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }

}
