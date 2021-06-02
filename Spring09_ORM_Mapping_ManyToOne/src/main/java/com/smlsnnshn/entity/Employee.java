package com.smlsnnshn.entity;

import com.smlsnnshn.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="employees")
public class Employee extends BaseEntity{

    private String first_name;
    private String last_name;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int salary;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name="department_id")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="region_id")
    private Region region;

    public Employee(){};

    public Employee(String first_name, String last_name, String email, LocalDate hireDate, Gender gender, int salary, Department department, Region region) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
        this.region = region;
    }

    public Employee(String first_name, String last_name, String email, LocalDate hireDate, Gender gender, int salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
