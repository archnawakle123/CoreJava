
public class SpecialCharacter {

	public static void main(String[] args) {
		
		String s="a@d#fhjhg%hhj***^90987676";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
