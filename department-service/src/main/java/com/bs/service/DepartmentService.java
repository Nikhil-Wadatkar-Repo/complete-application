package com.bs.service;

import com.bs.beans.Department;
import com.bs.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo repo;

    public List<Department> getAllDepartments() {
        return repo.getAllDepartments();
    }

    public Department createDepartment(Department department) {
        return repo.createDepartment(department);
    }

    public Department updateDepartment(Department department) {
        return repo.updateDepartment(department);
    }

    public Department getByID(Integer id) {

        return repo.getByID(id);
    }

    public String deleteDepartmentByID(Integer id) {
        return repo.deleteDepartmentByID(id);
    }

    public List<Object[]> getDepartmentwiseDepartment() {
        return repo.getDepartmentwiseDepartment();
    }
}
