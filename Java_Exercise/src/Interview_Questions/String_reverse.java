package Interview_Questions;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Jagadeesh";
		
		String[] arrname= name.split("");
		for(int i=arrname.length-1;i>=0;i--)
		{
		System.out.print(arrname[i]);
		}

	}

}
