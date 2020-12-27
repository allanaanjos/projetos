package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Work { 
	private String name;
	private WorkLevel level;
	private double baseSalary;
	
	
	private Departme departme;
	private List<HourContract> contracts = new ArrayList<>();
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkLevel getLevel() {
		return level;
	}


	public void setLevel(WorkLevel level) {
		this.level = level;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Departme getDepartme() {
		return departme;
	}


	public void setDepartme(Departme departme) {
		this.departme = departme;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}



	public Work() {
		
	}


	public Work(String name, WorkLevel level, double baseSalary, Departme departme) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departme = departme;
	}
    
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	} 
	
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	} 
	
	
	public double Income(int year, int month) {
		double sum = baseSalary; 
		
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			cal.setTime(c.getDate()); 
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
				
			}
			
		}   
		
		return sum;
	}


}
