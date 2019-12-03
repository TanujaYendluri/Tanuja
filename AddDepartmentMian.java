package com.hcl.department;

import java.util.Scanner;


public class AddDepartmentMian {
private static int departmentno;

public static void main(String[] args) {
		
		DepartmentDAO dao=new DepartmentDAO();
		System.out.println(dao.generateDepartment());
		Department department=new Department();
		int deptno=dao.generateDepartment();
		department.setDeptno(departmentno);                                        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ Dname");
		department.setDname(sc.nextLine());
		System.out.println("Enter Loc");
		department.setLoc(sc.nextLine());
		System.out.println("Enter City");
		department.setCity(sc.nextLine());
		System.out.println("Enter Head");
		department.setHead(sc.nextLine());
		System.out.println(dao.addDepartment(department));
			
		}

}
