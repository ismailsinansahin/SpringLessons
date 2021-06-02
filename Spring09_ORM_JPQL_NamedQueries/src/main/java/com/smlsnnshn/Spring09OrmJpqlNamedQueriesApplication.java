package com.smlsnnshn;

import com.smlsnnshn.repository.DepartmentRepository;
import com.smlsnnshn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Spring09OrmJpqlNamedQueriesApplication {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Spring09OrmJpqlNamedQueriesApplication.class, args);
    }

    @PostConstruct
    public void testEmployee(){
        System.out.println(employeeRepository.getEmployeeDetail());
        System.out.println(employeeRepository.getEmployeeSalart());
        System.out.println(employeeRepository.getEmployeeByEmail("dtrail8@tamu.edu"));
        System.out.println(employeeRepository.getEmployeeByEmailAndSalary("dtrail8@tamu.edu",82753));
        System.out.println(employeeRepository.getEmployeeByFirstNameAndSalary("Berrie",154864));
        employeeRepository.updateEmployeeJPQL(1);
        System.out.println(employeeRepository.retrieveEmployeeSalaryGreaterThan(100000));
        System.out.println(departmentRepository.findOzzyDepartment("Kids"));
        System.out.println(departmentRepository.countAllDepartments());
    }

}
