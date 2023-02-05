package com.bs.exception;

public class EmptyEmployeeList extends RuntimeException {
    public EmptyEmployeeList(String message) {
        super(message);
    }

}
