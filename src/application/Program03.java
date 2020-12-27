package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import  java.util.Scanner;

import entities.Departme;
import entities.HourContract;
import entities.Work;
import entities.enums.WorkLevel;

public class Program03 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("enter departments name: ");
		String departmentName = sc.nextLine();
		System.out.println("enter work name: ");
		System.out.print("Name: ");
		String workName = sc.nextLine(); 
		System.out.print("level: ");
		String workLevel = sc.nextLine();
		System.out.print("baseSalary: ");
		double baseSalary = sc.nextDouble();
		
		Work work = new Work (workName, WorkLevel.valueOf(workLevel), baseSalary, new Departme(departmentName)); 
		
		System.out.print("how many contracts to this worker: ");
		int n = sc.nextInt(); 
		
		for(int i=1;i<=n; i++) {
			System.out.println("Enter contract #" + i + "data: ");
			System.out.println("date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); 
			System.out.println("Value per hour: ");
			double ValuePerHour = sc.nextDouble();
			System.out.println("Duration (hour): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, ValuePerHour, hours);
			work.addContract(contract);
			
		} 
		
		System.out.println();
		System.out.println("enter month and year to calcule income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year  = Integer.parseInt(monthAndYear.substring(3));  
		
		
		System.out.println("Name: " + work.getName());
		System.out.println("Department: " + work.getDepartme().getName());
		System.out.println("income for " + monthAndYear + " :" +  work.Income(year, month));
		
		
		
		sc.close();

	}

}
