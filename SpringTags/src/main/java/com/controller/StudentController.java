package com.controller;

import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
public class StudentController {

	@Value("#{countryCodes}")
	private LinkedHashMap map;

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, "name", stringTrimmerEditor);
		
		
		
	}
	
	@RequestMapping("/getStudentForm")
	public String getStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentForm";
	}

	@RequestMapping("/processStudentForm")
	public String processStudentForm( @ModelAttribute("student") @Validated Student student, BindingResult bindingResult) {
		System.out.println(bindingResult);
		
		System.out.println("****************************");
		
		System.out.println(student.getName());
		if (bindingResult.hasErrors()) {
			return "studentForm";
		} else {
			return "processStudentForm";
		}
	}

}
