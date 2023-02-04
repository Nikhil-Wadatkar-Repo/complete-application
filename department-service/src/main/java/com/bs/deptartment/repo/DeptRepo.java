package com.bs.deptartment.repo;

import com.bs.deptartment.beans.DepartmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DeptRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DepartmentDetails> getAllDepartments() {

        List<DepartmentDetails> mylist = new LinkedList<>();
        RowMapper<DepartmentDetails> rowMapperInstance = (ResultSet rs, int rowNum) -> {
            return new DepartmentDetails(rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getInt(4));
        };


        List<DepartmentDetails> outputResult = jdbcTemplate.query("select * from department", rowMapperInstance);
        return outputResult;
    }
}
