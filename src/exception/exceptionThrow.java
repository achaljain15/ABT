package exception;

public class exceptionThrow {
	
	public static void main(String args[]) throws ArithmeticException {
		try{
			System.out.println(1/0);		
		//throw new ArithmeticException();
	}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
