import java.util.Locale;
import java.util.Scanner;

public class SalarioEmLisarb {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double renda = sc.nextDouble();
		
		double ImpostoDeRenda;

		if(renda <=2000.0) {
			ImpostoDeRenda = 0.0;
		
		}else if (renda <=3000.0) {
			ImpostoDeRenda = (renda - 2000.0) * 0.08;
			
		}else if (renda <=4500.0) {
			ImpostoDeRenda = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
			
		}else  {
			ImpostoDeRenda = (renda - 4500.0) * 0.28 + 1500 * 0.18 + 1000.0 * 0.08;
			
		}if (ImpostoDeRenda == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$%.2f%n", ImpostoDeRenda);
		}
		
		
		

		sc.close();
	}

}
