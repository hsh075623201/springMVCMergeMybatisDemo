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
		model.addAttribute("employee", employeeService.getEmployee());//�������� ��ҳ��չʾ
		return "student/student";//������studentĿ¼�µ�student.jspҳ��
	}
	
	@RequestMapping("/test")
	public String test(Model model){
		return "index";//������studentĿ¼�µ�student.jspҳ��
	}
	
}