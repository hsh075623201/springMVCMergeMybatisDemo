package cn.edu.shou.hsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.shou.hsh.dao.EmployeeDao;
import cn.edu.shou.hsh.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	public List<Employee> getEmployee(){
		
		return employeeDao.getEmployee();
	}
}
