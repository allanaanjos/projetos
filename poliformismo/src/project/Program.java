package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("enter the number of employee: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n; i++) {
			System.out.println("Employee: #" + i + " Data: ");
			System.out.print("Outsorced: (y:n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per Hours: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.println("additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			}else {
				 
				list.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		
		System.out.println();
		System.out.println("Payment: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.Payment()));      
			
		}
		
		
		
		sc.close();
		

	}

}
