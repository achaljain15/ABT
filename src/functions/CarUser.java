package functions;

import AccessModifier.Modifiers;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carUser= new Car();
		carUser.color="White";
		carUser.type="XUV";
		//carUser.wheels=6;
		carUser.wheels=6;
		carUser.feature();
		
		Car owner= new Car();
		owner.color="Black";
		owner.type="Sedan";
		owner.wheels=4;
		owner.feature();
	Modifiers access= new Modifiers();
		access.publicModifier();
		
		Car[] car=new Car[2];
		car[0]=new Car();
		car[0].feature();
		
		Class<Car> c=Car.class;
		//int num= Car.wheels;
	
	}

}
