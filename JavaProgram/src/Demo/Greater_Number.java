package Demo;

public class Greater_Number {

	public static void main(String[] args) {
		int x=100;
		int y=200;
		int z=30;
		
		if(x>y && x>z)
			System.out.println("Greter Number :"+x);
		
		else if(y>x && y>z)
			System.out.println("Greater Number :"+y);
		
		else if(z>x && z>y)
			System.out.println("Greater Number :"+z);
		
		else
			System.out.println("Not Greater Number");
	}

}
