package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
public class StudentController {
	@RequestMapping("/studentForm")
	public String getStudentForm(Model model) {
		Student student = new Student();
		student.setName("Priya Sahoo");
		student.setAge(30);
		model.addAttribute("student", student);
		return "studentForm";
	}
}
