 package oops.encapsulation;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserDetails abc = new UserDetails();
//int age=abc.setAge(22);
System.out.println(abc.getAge());
abc.setAge(22);
System.out.println(abc.getAge());

String a="Ananannanana";
String[] b=a.split("n");

for(String s:b)
	System.out.print(s);

	}

}
