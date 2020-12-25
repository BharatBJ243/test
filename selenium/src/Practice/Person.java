package Practice;

public class Person extends Thread  {

	String name ; 
	
	Person() {} 
	
	Person(String name )
	{
		this.name = name  ;
	}
	
	void print() 
	{
		for ( int i = 1 ; i <= 5 ; i++ )
		{
			System.out.println("Name : " + name +", " + i );
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Problem while sleep");
			}
		}
	}	
	
	public void run() 
	{
		print() ; 
	}
}
