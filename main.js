package sistemas;

public class main{
	public static void main(String[] args) throws InterruptedException {
		int v[] = {3, 5, 1, 4, 8, 9, 7, 10, 2, 6};
		
		Media s1 = new Media(v);
		Mediana s2 = new Mediana(v);
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
		
        //System.out.println("media = " + s1.mediaAritmetica());
		double thread1= s1.getResultado();
        double thread2 = s2.getResultado();
        System.out.println("Média= "+thread1);
        System.out.println("Mediana = "+thread2);        
	}
}
