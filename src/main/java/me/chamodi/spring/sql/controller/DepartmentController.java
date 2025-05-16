package me.chamodi.spring.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.sql.models.Department;
import me.chamodi.spring.sql.repo.DepartmentRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/depts")
public class DepartmentController {
    @Autowired
    private DepartmentRepo repo;

    @GetMapping
    public List<Department> getDepts(){
        return repo.findAll();
    }
    
    @GetMapping("/{id}")
    public Department getDept(@PathVariable("id") String id) {
        return repo.findById(id).get();
    }
    
}
