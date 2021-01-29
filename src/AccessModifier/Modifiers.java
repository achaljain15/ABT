package AccessModifier;

public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers obj = new Modifiers();
			obj.publicModifier();
			obj.privateModifier();
			obj.defaultModifer();
			obj.ProtectedModifer();
	}
	
	public void publicModifier() {
	System.out.println("Public modiifer function");
	}
	
	void defaultModifer()
	{
		System.out.println("Default Modifier");
	}
	
	private void privateModifier()
	{
		System.out.println("Private modifier");
	}
protected void ProtectedModifer()
{
	System.out.println("Protected modifier");
}
}
