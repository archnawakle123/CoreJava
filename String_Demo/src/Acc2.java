
public class Acc2 {

	public static void main(String[] args) {
		String s="HELLO";
		int totalcount=s.length();
		int totalcount_afterremove=s.replace("L", "").length();
		int count =totalcount-totalcount_afterremove;
		System.out.println("L repet:"+count);
	}

}
