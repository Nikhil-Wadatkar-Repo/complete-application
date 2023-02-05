package com.bs.beans;

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
public class Department {
    @Id
    private Integer id;
    @Column
    private Integer monthlyBudget;
    @Column
    private String name;

    @Column
    private Integer lastEmployeeId;



}
