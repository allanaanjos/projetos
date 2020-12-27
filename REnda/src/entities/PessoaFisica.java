package entities;

public class PessoaFisica extends Pessoas {
	
	private double gastSaude;
	
	
	public PessoaFisica() {
		super();
	}


	public PessoaFisica(String name, double anualIncome, double gastSaude) {
		super(name, anualIncome);
		this.gastSaude = gastSaude;
	}


	public double getGastSaude() {
		return gastSaude;
	}


	public void setGastSaude(double gastSaude) {
		this.gastSaude = gastSaude;
	}

	
	public double Imposto() {
		
		if(anualIncome <= 20000) {
			double Fisimposto;
			Fisimposto = 15 * anualIncome;
			return Fisimposto;
		}else {
	    	double Fisimposto;
	    	double Gast;
	    	 Gast = anualIncome * 50;
			 Fisimposto = Gast - 20 * anualIncome;
			 return Fisimposto;
			
		}
	}
}
