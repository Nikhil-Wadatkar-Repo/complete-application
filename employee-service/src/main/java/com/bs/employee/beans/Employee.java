package com.bs.employee.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Integer id;
    @Column
    private Integer department_id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String job_id;
    @Column
    private String phone;
    @Column
    private Integer salary;
    @Column
    private Date birthdate;
    @Column
    private Date hire_date;


}
