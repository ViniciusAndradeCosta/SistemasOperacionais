package sistemas;

public class main {

	public static void main(String[] args) throws InterruptedException {
		int n =0;
		
		
		Contador s1= new Contador(n, 1);
		s1.start();
		s1.join();
		n = s1.getValor();
		
		Contador s2= new Contador(n,1);
		s2.start();
		s2.join();
		n = s2.getValor();
		
		Contador s3= new Contador(n,2);
		s3.start();
		s3.join();
		n = s3.getValor();
		
		Contador s4= new Contador(n,2);
		s4.start();
		s4.join();
		
		
		int result= s4.getValor();
		System.out.println(""+result);
	}
}
