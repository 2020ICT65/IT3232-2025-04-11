package me.chamodi.spring.sql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.sql.repo.DepartmentRepo;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentRepo repo;
}
