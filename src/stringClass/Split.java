package stringClass;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="My name is Achal";
		String reverse= "";
		String[] split= name.split(" ");
		int length=split.length;
		StringBuffer sb;

		for(int i=0;i<length;i++)	
		{
			if((split[i].equals("My"))||(split[i].equals("Achal")))
			{
			sb=new StringBuffer(split[i]);
			System.out.println(sb.reverse());
			}
			else {
				System.out.println(split[i].toUpperCase());
			}

	}

}
}
