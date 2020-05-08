package com.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Employee;

@Controller
public class EmployeeController {

	public EmployeeController() {
		System.out.println();
	}

	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor stringtrimmereditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, stringtrimmereditor);
	}

	@RequestMapping("/employeeForm")
	public String EmployeeFormData(@ModelAttribute Employee emp) {
		return "EmployeeForm";
	}

	@RequestMapping("/ProcessEmployee")
	public String ProcessEmployeeForm(@Valid @ModelAttribute Employee emp, BindingResult bindresult) {

		System.out.println("emloyee name is : " + emp.getEmpName());

		if (bindresult.hasErrors()) {
			return "EmployeeForm";
		} else {
			return "ProcessEmployeeForm";
		}
	}

}
