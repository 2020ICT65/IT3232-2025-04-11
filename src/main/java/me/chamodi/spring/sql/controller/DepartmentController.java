package me.chamodi.spring.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.sql.models.Department;
import me.chamodi.spring.sql.repo.DepartmentRepo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





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
    
    @PostMapping
    public String addDept(@RequestBody Department department) {
        repo.save(department);
        return "New Department Created!";
    }
    
    @PutMapping("/{id}")
    public String updateDept(@PathVariable String id, @RequestBody Department department) {
        if(repo.findById(id).isEmpty()){
            return "Couldn't find the department!";
        }
        repo.save(department);
        return "Updated Successfully!";
    }

    @DeleteMapping("/{id}")
    public String deleteDept(@PathVariable("id") String id) {
        if(repo.findById(id).isEmpty()){
            return "Couldn't find the department!";
        }
        repo.deleteById(id);;
        return "Department Deleted Successfully!";
    }

}
