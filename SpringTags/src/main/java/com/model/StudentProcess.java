package com.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.AutoPopulatingList;

public class StudentProcess {
	private Map<String, AutoPopulatingList<Student>> map = new LinkedHashMap<String, AutoPopulatingList<Student>>();
	private String rough="roughValue";
	public StudentProcess() {
		Map<String, List<Student>> map = new LinkedHashMap<String, List<Student>>();
		List<Student> students = new ArrayList<Student>();
	}
	public StudentProcess(String s) {
		this.map = getData();
	}

	
	
	public Map<String, AutoPopulatingList<Student>> getMap() {
		return map;
	}
	public void setMap(Map<String, AutoPopulatingList<Student>> map) {
		this.map = map;
	}
	public static Map getData() {
		Map<String, List<Student>> map = new LinkedHashMap<String, List<Student>>();
		List<Student> students = new ArrayList<Student>();
		
		Student s;
		s = new Student("A", 1);
		students.add(s);
		
		s = new Student("B", 1);
		students.add(s);
		
		map.put("10", students);
		return map;
		
	}

	public String getRough() {
		return rough;
	}

	public void setRough(String rough) {
		this.rough = rough;
	}
	
}
