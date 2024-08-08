package sistemas;

import java.util.Arrays;

public class Mediana extends Thread {
	double resultado;
	int quant = 9;
	int vetor[];

	Mediana(int[] v) {
		this.vetor = v;
	}

	
	public double getResultado() {
		return resultado;
	}
	
	public void run() {
		for (int i = 0; i < vetor.length; i++) {
			Arrays.sort(vetor);
			
		}
		
		int div = quant/2;
		if(div % 2==1) {
			div-=1;
			resultado = vetor[div];
		}else {
			div-=1;
			System.out.println("Valor1: "+vetor[div]+"Valor2: "+vetor[div+1]);
			resultado= ((double)(vetor[div]+vetor[div+1]))/2 ;
		}
	}

}
