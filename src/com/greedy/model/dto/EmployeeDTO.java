package com.greedy.model.dto;

import java.sql.Date;

/*DTO 요건
 * 1. 모든 필드 private
 * 2. 기본생성자 필수/매개변수있는 생성자 선택
 * 3. setter/getter 필수
 * 4. toSting 선택 (거의 작성하긴 함)*/

public class EmployeeDTO {

	private String empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
	private String deptCode;
	private String jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private String managerId;
	private java.sql.Date hireDate;
	private java.sql.Date entDate;
	private String entYn;
	
	
	public EmployeeDTO() {}


	public EmployeeDTO(String empId, String empName, String empNo, String email, String phone, String deptCode,
			String jobCode, String salLevel, int salary, double bonus, String managerId, Date hireDate, Date entDate,
			String entYn) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
		this.salLevel = salLevel;
		this.salary = salary;
		this.bonus = bonus;
		this.managerId = managerId;
		this.hireDate = hireDate;
		this.entDate = entDate;
		this.entYn = entYn;
	}



	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public String getJobCode() {
		return jobCode;
	}

	public String getSalLevel() {
		return salLevel;
	}

	public int getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public String getManagerId() {
		return managerId;
	}

	public java.sql.Date getHireDate() {
		return hireDate;
	}

	public java.sql.Date getEntDate() {
		return entDate;
	}

	public String getEntYn() {
		return entYn;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public void setSalLevel(String salLevel) {
		this.salLevel = salLevel;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public void setHireDate(java.sql.Date hireDate) {
		this.hireDate = hireDate;
	}

	public void setEntDate(java.sql.Date entDate) {
		this.entDate = entDate;
	}

	public void setEntYn(String entYn) {
		this.entYn = entYn;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", empNo=" + empNo + ", email=" + email
				+ ", phone=" + phone + ", deptCode=" + deptCode + ", jobCode=" + jobCode + ", salLevel=" + salLevel
				+ ", salary=" + salary + ", bonus=" + bonus + ", managerId=" + managerId + ", hireDate=" + hireDate
				+ ", entDate=" + entDate + ", entYn=" + entYn + "]";
	}
	}
