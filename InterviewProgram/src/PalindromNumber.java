import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=11211;
		System.out.println("Enter the Number");
		//int num=sc.nextInt();
		int orgnum=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev) {
			System.out.println("Palindrom Number "+rev);
		}
		else {
			System.out.println("Not Palindrom Number ");
		}

	}

}
