package com.bs.employee.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.employee.beans.Employee;
import com.bs.employee.repo.EmployeeRepo;

@Service
public class MultithreadedService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployeesMultithread() throws InterruptedException {
		List<Employee> mainList = new LinkedList<>();

		long start = System.currentTimeMillis();
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
		synchronized (threadOne) {

			threadOne.wait();
			mainList.addAll(threadOne.employeeByDeptID);

		}

		long end = System.currentTimeMillis();

		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("#################################Execution time is " + formatter.format((end - start) / 1000d)
				+ " seconds(\"#################################");
		return mainList;
	}

}

class ThreadOne extends Thread {
	List<Employee> employeeByDeptID = null;
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void run() {

		synchronized (this) {

			employeeByDeptID = employeeRepo.getEmployeeByDeptID("1");

			this.notify();

		}

	}
}
