import java.util.ArrayList;
import java.util.Iterator;

public class CopyArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(56);
		al.add(99);
		al.add(87);
		al.add(23);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(56);
		al2.add(98);
		al2.add(34);
		al2.add(56);
		
		al.addAll(al2);
		System.out.println("copy arraylist is :"+al );
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
