package scp;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandamNo24Aug {
	
	private static String ROLES [] = {"manager","se", "sse", "lead","dev","tester","srmanager"};
	public static void main(String[] args) {
		
		int noOfTimesLoop = ThreadLocalRandom.current().nextInt(5,10);
		System.out.println(noOfTimesLoop);
		
		String name="";
		for (int i = 0; i <noOfTimesLoop ; i++) {
			int no = ThreadLocalRandom.current().nextInt(65,90);
			char  c = (char) no;
			name += Character.toString(c);
			System.out.println(name);
			
		}
		
		
		Emp emp=new Emp(101, "XXXX", 1245.34, ROLES);
		Emp employees [] = getDummyEmps(10);		 // arrray of emps

	}

	private static Emp[] getDummyEmps(int no) {
		for (int i = 0; i < no; i++) {
			
		}
		return null;
	}

}



 class Emp {

	private int empId;
	private String empName;
	private double empSalary;
	private String empRoles[]; // list of roles

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String empName, double empSalary, String[] empRoles) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empRoles = empRoles;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String[] getEmpRoles() {
		return empRoles;
	}

	public void setEmpRoles(String[] empRoles) {
		this.empRoles = empRoles;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empRoles="
				+ Arrays.toString(empRoles) + "]";
	}

}
