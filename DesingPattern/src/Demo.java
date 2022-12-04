
public class Demo implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
