package cn.edu.shou.hsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.shou.hsh.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/student")
	public String student(Model model){
		model.addAttribute("employee", employeeService.getEmployee());//存入数据 到页面展示
		return "student/student";//返回至student目录下的student.jsp页面
	}
	
	@RequestMapping("/test")
	public String test(Model model){
		return "index";//返回至student目录下的student.jsp页面
	}
	
}
