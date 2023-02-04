package com.bs.deptartment.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class DepartmentDetails {
    private Integer id;
    private String name;
    private Integer monthlyBudget;
    private Integer lastEmployeeId;
}
