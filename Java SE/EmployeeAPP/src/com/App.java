package com;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	static {

		Employee e1 = new Employee(298, "Jfg", 76523, LocalDate.of(1987, 02, 12));
		Employee e2 = new Employee(292, "Sjh", 87582, LocalDate.of(1987, 05, 12));
		Employee e3 = new Employee(198, "Dkj", 13561, LocalDate.of(1978, 01, 23));
		Employee e4 = new Employee(123, "Abc", 54548, LocalDate.of(1990, 8, 21));
		Employee e5 = new Employee(245, "Gfd", 23547, LocalDate.of(1985, 03, 18));
		Employee e6 = new Employee(242, "Kfd", 63544, LocalDate.of(1987, 05, 11));

		EmployeeUtil.getList().add(e1);
		EmployeeUtil.getList().add(e2);
		EmployeeUtil.getList().add(e3);
		EmployeeUtil.getList().add(e4);
		EmployeeUtil.getList().add(e5);
		EmployeeUtil.getList().add(e6);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeDaoImpl empDao = new EmployeeDaoImpl();

		while (true) {
			System.out.println("\nMENU");
			System.out.println("1.Add Employee");
			System.out.println("2.Display");
			System.out.println("3.Find");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("6.BackUp data");
			System.out.println("7.Restore data");
			System.out.println("8.Exit");
			System.out.println("Enter Choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				Employee emp = new Employee();
				System.out.println("Enter Employee Id");
				emp.setEmpId(sc.nextInt());
				sc.nextLine();
				System.out.println("name: ");
				emp.setEmpName(sc.nextLine());
				System.out.println("Salary: ");
				emp.setSalary(sc.nextDouble());
				System.out.println("DOB: ");
				emp.setDob(LocalDate.parse(sc.next()));
				emp.calculateAge();

				empDao.addEmployee(emp);

				break;
			case 2:

				Employee.display(EmployeeUtil.getList());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Thank you.Visit again");
				System.exit(0);
			default:
				System.out.println("Invalid Choice. Try again");
			}
		}

	}

}
