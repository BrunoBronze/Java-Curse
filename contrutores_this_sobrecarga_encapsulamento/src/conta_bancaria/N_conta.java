package conta_bancaria;

import java.util.Random;

public class N_conta {
	
	Random random = new Random();
	
	int conta  = random.nextInt(99999);
	int digito = random.nextInt(9);
	
	public String gerar_N(){
		String n_conta = String.valueOf(conta + "-" + digito);
		
		return n_conta;
	}
	

}
