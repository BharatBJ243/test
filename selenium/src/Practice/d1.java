package Practice;

public class d1 {

	public static void main(String[] args)throws InterruptedException {
		Person p1 = new Person("Smith") ; // new state 
		Person p2 = new Person("Laila") ; // new state 
		Person p3 = new Person("Martin") ; 
		p1.start();  
		p2.start();
		p3.start()  ; 
		
		
	}
	
}

