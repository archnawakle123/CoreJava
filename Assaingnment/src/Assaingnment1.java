
public class Assaingnment1 {

	public static void main(String[] args) {
		int year=2004;
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("This is Leap year  :"+year);
		}
		else {
			System.out.println("This year is not Leap Year :"+year);
		}

	}

}
