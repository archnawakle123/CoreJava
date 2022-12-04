package Demo;

public class LeapYear_Program {

	public static void main(String[] args) {
		int year=2004;
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
		System.out.println("Its Leap Year...");
		}
		else {
			System.out.println("Its not leap Year");
		}
		
		
		

	}

}
