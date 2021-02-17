package inheritance;

public class EndUser {
public   String name="achal";

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(20000);
		System.out.println("Hi");
		
		EndUser c =new EndUser();
		c.name="Sneha";
	
	
	Telephone a= new Mobile();
	a.dialing();
	}

}
