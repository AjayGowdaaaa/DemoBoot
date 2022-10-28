package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class EmpController {

	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String home() {
		System.out.println("Home method Running");
		return "home";
	}

	@RequestMapping("/addEmp")
	public String addEmployee(Employee  employee) {
		System.out.println("addEmployee method Running");
		repo.save(employee);
		return "home";
	}

	//	@RequestMapping("/getEmp")
	//	public ModelAndView getEmployee(@RequestParam int id) {
	//		ModelAndView mv = new ModelAndView("show");
	//		Employee employee = repo.findById(id).orElse(new Employee());
	//		mv.addObject(employee);
	//		return mv;
	//	}

	@RequestMapping("/employees")
	@ResponseBody
	public List<Employee> getEmployee() {
		return repo.findAll();
	}
	
	@RequestMapping("/employee/{id}")
	@ResponseBody
	public Optional<Employee> getEmployee(@PathVariable("id") int id) {
		return repo.findById(id);
	}

}
