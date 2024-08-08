package sistemas;

public class Media extends Thread {
	
	double resultado; 
	int quant = 9;
	int vetor[];
	
	Media(int []v){
		vetor = v;	
	}
	
	public int SomaVetor() {
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
		 soma += vetor[i];
		}
		return soma;	
	}
	
    public void run() {
    	quant+=1;
    	System.out.println("Tamanho do vetor: "+quant);
    	int soma = SomaVetor();
    	resultado = (double)soma/quant;	
	}
    
    public double getResultado() {
		return resultado;
	}	
}
