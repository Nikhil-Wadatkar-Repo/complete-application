package com.bs.repo;

import com.bs.beans.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DepartmentRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Department> getAllDepartments() {


        return null;
    }

    public Department createDepartmentByCoding(Department department) {
//        Insert into department (ID,NAME,MONTHLY_BUDGET,LAST_EMPLOYEE_ID) values (1,'ACCOUNTING',20000,8);
        int id = department.getId();
        int monthlyBudget = department.getMonthlyBudget();
        String name = department.getName();
        int last = department.getLastEmployeeId();
        String sqlQuery = "Insert into department (ID,NAME,MONTHLY_BUDGET,LAST_EMPLOYEE_ID) values (" + id + ",'" + name + "'," + monthlyBudget + "," + last + ")";
        System.out.println(sqlQuery);
        int update = jdbcTemplate.update(sqlQuery);
        System.out.println(update);
        return null;
    }

    public Department createDepartmentByPreparedStatementCallback(Department department) {
        int id = department.getId();
        int monthlyBudget = department.getMonthlyBudget();
        String name = department.getName();
        int last = department.getLastEmployeeId();
        String sqlQuery = "Insert into department (ID,NAME,MONTHLY_BUDGET,LAST_EMPLOYEE_ID) values (?,?,?,?)";
        System.out.println(sqlQuery);
        Object execute = jdbcTemplate.execute(sqlQuery, new PreparedStatementCallback<Object>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, department.getId());
                ps.setString(2, department.getName());
                ps.setInt(3, monthlyBudget);
                ps.setInt(4, department.getLastEmployeeId());
                return ps.execute();
            }
        });
        return null;
    }

    public Department updateDepartment(Department department) {

        return null;
    }

    public Department getByID(Integer id) {

        return null;
    }

    public String deleteDepartmentByID(Integer id) {

        String message = null;
        return message;
    }

    public List<Object[]> getDepartmentwiseDepartment() {

        return null;
    }

}