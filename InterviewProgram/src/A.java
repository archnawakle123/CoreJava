
public class A {
	public static void main(String[] args) {
		
	
		int i =1234567;
		//String s=Integer.toString(i);
		//System.out.println(s.length());
		int count=0;
		while(i>0) {
			count++;
			i=i/10;
		}
		System.out.println(count);
	}
}
