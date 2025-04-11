package me.chamodi.spring.sql.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
    private String empNo;
    private String name;
    private int age;
    private double salary;
    private String gender;
    @ManyToOne
    private Department department;
    @ManyToMany(mappedBy = "employees")
    private List<Project> project;


    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public Employee(String empNo, String name, int age, double salary, Department department, String gender,List<Project> project) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.department = department;
        this.project = project;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
