package com.bs.employee.repo;

import com.bs.employee.beans.Employee;
import com.bs.employee.beans.IDepartmentWiseCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    @Query( value = "select department_id, count(*) from employee group by department_id",nativeQuery = true)
//    public Map<Integer,Integer> getDepartmentwiseEmployee();
//    public List<DepartmentWiseCountDetails> getDepartmentwiseEmployee();
    public List<Object[]> getDepartmentwiseEmployee();



//    @Query("SELECT c.department_id AS deptID, COUNT(*) AS totalCount  FROM Employee AS c GROUP BY c.department_id")
@Query( value = "select department_id AS deptID, count(*) AS totalCount  from employee group by department_id",nativeQuery = true)
    public List<IDepartmentWiseCount> countTotalCommentsByYearInterface();
}
