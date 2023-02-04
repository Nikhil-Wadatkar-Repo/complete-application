package com.bs.deptartment.controller;

import com.bs.deptartment.repo.DeptRepo;
import com.bs.deptartment.beans.DepartmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DeptRepo departmentRepo;

    @GetMapping("/get")
    public List<DepartmentDetails> getAllDepartments() {
        return departmentRepo.getAllDepartments();
    }
}
