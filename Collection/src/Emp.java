import java.util.ArrayList;
import java.util.Iterator;

public class Emp {
//create the arraylist for user type for Emp
	public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	al.add(new Employee(1,"80000","Shiu"));
	al.add(new Employee (2,"90000","Khushi"));
	al.add(new Employee(3,"40000","Pranita"));
	al.add(new Employee(4,"70000","Rudra"));
	
	//by using iterator
	Iterator<Employee> itr=al.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	for(Employee e:al) {
		System.out.println("using foreach"+e);
	}
	}

}
