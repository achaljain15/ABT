package constructor;

public class XUV extends Car{

	
	public XUV(int w) {
		super(w);
		// TODO Auto-generated constructor stub
	}
	public void child()
	{
		System.out.println("Child Class");
	}
public static void main(String args[])
{
	Car obj=new XUV(4);
	obj.feature();
	((XUV) obj).child();
}

}
