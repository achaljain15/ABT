package constructor;

public class XUV extends Car{

	public void child()
	{
		System.out.println("Child Class");
	}
	public static void main(String args[])
	{
		XUV obj= new XUV();
		Car obj2=new XUV();
	}

}
