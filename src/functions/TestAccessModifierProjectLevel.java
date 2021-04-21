package functions;

import AccessModifier.Modifiers;

public class TestAccessModifierProjectLevel extends Modifiers {
	public static void main() {
		
	
	Modifiers obj = new Modifiers();
	obj.publicModifier();
	//obj.privateModifier();
	//obj.defaultModifer();
	//Accessing Protected member of Modifiers class in AccessModifier package
	TestAccessModifierProjectLevel obj1=new TestAccessModifierProjectLevel();
	obj1.ProtectedModifer();
	}
}
