package com.bs.controller;

import com.bs.beans.Department;
import com.bs.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/obj")
    public Department department(){
        return new Department(12,12,"asa",12);
    }

    @GetMapping("/get")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/create")
    public Department createDepartment(@RequestBody Department department) {
        departmentService.createDepartmentByCoding(department);
        departmentService.createDepartmentByPreparedStatementCallback(department);
        return null;
    }

    @PostMapping("/update")
    public Department updateDepartment(@RequestBody Department department) {
        return departmentService.updateDepartment(department);
    }

    @GetMapping("/getByID/{id}")
    public Department getByID(@PathVariable("id") Integer id) {
        return departmentService.getByID(id);
    }

    @GetMapping("/deleteByID/{id}")
    public String deleteByID(@PathVariable("id") Integer id) {
        return departmentService.deleteDepartmentByID(id);
    }




}
