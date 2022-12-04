import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Z");
		al.add("Y");
		al.add("X");
		al.add("W");
		al.add("N");
		al.add("O");
		al.add("B");
		al.add("A");
		al.add("B");
		al.add("C");
		
		Collections.sort(al);
		System.out.println(al);

	}

}
