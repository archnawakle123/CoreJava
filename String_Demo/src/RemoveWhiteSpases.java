
public class RemoveWhiteSpases {

	public static void main(String[] args) {
	String str="   Archna   Navnath   Wakle   ";
	System.out.println("Before Removing the white Spaces :"+str);
	str=str.replaceAll("\\s", "");
	System.out.println("After removing the white spaces :"+str);

	}

}
