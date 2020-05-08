package com.yatan.model;

import java.util.List;
import java.util.Map;

public class StudentFormModel {
	Map<String, List<Address>> studentAddressMap;

	public Map<String, List<Address>> getStudentAddressMap() {
		return studentAddressMap;
	}
	public void setStudentAddressMap(Map<String, List<Address>> studentAddressMap) {
		this.studentAddressMap = studentAddressMap;
	}
}
