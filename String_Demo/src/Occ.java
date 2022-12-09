
public class Occ {

	public static void main(String[] args) {
		String s="java programing and java string";
		int totalcount=s.length();
		      int totalcount_afterRemove= s.replace("a", "").length();//total length after removing a
		      int count=totalcount-totalcount_afterRemove;
		      System.out.println(count);
	}

}
