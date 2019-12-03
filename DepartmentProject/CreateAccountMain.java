package com.hcl.department;

import java.util.List;

public class CreateAccountMain {
	
	public static void main(String[] args) {
		
		DepartmentDAO dao=new DepartmentDAO();
         List<Department> departmentList=dao.showDepartment();
		for (Department department : departmentList) {
			
		
			 System.out.println("Department No"  +department.getDeptno());
			 System.out.println("Daprtment Name"  +department.getDname());
			 System.out.println("Loc"  +department.getLoc());
			 System.out.println("City"  +department.getCity());
			 System.out.println("Head"  +department.getHead());
			 System.out.println("..................");
			
		}
	}



}