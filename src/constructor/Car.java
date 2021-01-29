package constructor;

public class Car {

String color;
String type;
int wheels;
public void feature()
{
System.out.println("color = "+color+ " car has "+ wheels+ " wheels and type is "+type);	
}

public Car(int w) {
	
	int wh=w;
	System.out.println("Constructor"+w);
}
}
