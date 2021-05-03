package constructor;

public class XUV extends Car{

	  public XUV(int w)
	   { 
	  super(w); System.out.println("Child class constructor "+w);
	   }
	public void child()
	{
		System.out.println("Child Class");
	}
public static void main(String args[])
{/*
	 * Car obj=new XUV(4); obj.feature(); ((XUV) obj).child();
	 * 
	 * Car car=new Car(); Car obj2=new XUV(3); XUV obj3= new XUV(2);
	 */
	
	Car obj = new XUV(4);
	
	XUV obj2=new XUV(3);
	
	// class constructor.Car cannot be cast to class constructor.XUV (constructor.Car and constructor.XUV are in module ABT of loader 'app')at ABT/constructor.XUV.main(XUV.java:26)
//	XUV obj3=(XUV) new Car();
	
}

}
