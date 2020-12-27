package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Pessoas;

public class ProjetoPfPj {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoas> list = new ArrayList<>();
		
		
		System.out.print("enter the number of taxes payer: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("individual or company: (i/c)? ");
			char c = sc.next().charAt(0);
			if(c == 'i') {
				System.out.println("tax payer #" + i + " data: ");
				System.out.println("name:  ");
				sc.nextLine();
				String name = sc.next();
				System.out.println("anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.println("helth expenditures: ");
				double gastSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(name, anualIncome, gastSaude));

			}else { 
				 System.out.println("tax payer #" + i + " data: ");
			     System.out.println("name:  ");
			     sc.nextLine();
			     String name = sc.next();
				 System.out.println("anual income: ");
				 double anualIncome = sc.nextDouble();
				 System.out.println("number of employee: ");
				 int numberemployee = sc.nextInt();
				 
				 list.add(new PessoaJuridica(name, anualIncome, numberemployee));
						
			}
			
			
			
		}
		
		System.out.println();
		System.out.println("TAX PAID: ");
		
		for(Pessoas pess : list) {
			System.out.println(pess.getName() + " - " + pess.Imposto());
		}
		
		sc.close();
		
	}
	
	
	
}
