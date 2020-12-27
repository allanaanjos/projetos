package entities;


import java.util.ArrayList;
import java.util.List;

public abstract class Pessoas {
	private String name;
	protected double anualIncome;
	
	
	List<Pessoas> list = new ArrayList<>();
	
	public Pessoas() {
		
	}


	public Pessoas(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAnualIncome() {
		return anualIncome;
	}


	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}

	
	public double TotalPaid() {
			
		
		
	}
	
	public double Imposto() {
	  	
	}
	
	
}
