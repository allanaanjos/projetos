package entities;

public class PessoaJuridica extends Pessoas {
	
	private Integer numberemployee;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, double anualIncome, Integer numberemployee) {
		super(name, anualIncome);
		this.numberemployee = numberemployee;
	}

	public Integer getNumberemployee() {
		return numberemployee;
	}

	public void setNumberemployee(Integer numberemployee) {
		this.numberemployee = numberemployee;
	}  
	
	
	public double Imposto() {
		if(numberemployee > 10) {
			double JuridPess;
		     JuridPess = 14 * anualIncome;
		     return JuridPess;
		}else {
			double JuridPess;
			 JuridPess = 16 * anualIncome;
			 return JuridPess;
		}
		
		
	}

}
