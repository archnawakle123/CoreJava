import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]= {1,3,2,7,4,6};
		System.out.println("input array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many time shifted arry to left");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++) {
			int first =a[0];
			
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println();
		System.out.println("OutPut array :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	
}
