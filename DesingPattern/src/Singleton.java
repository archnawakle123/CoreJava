
public class Singleton {
private static Singleton singleton =new Singleton();
private Singleton() {
	
}
public static Singleton getInstance() {
	synchronized (Singleton.class) {
		if(singleton==null) {
			singleton=new Singleton();
		}
		else {
			return singleton;
		}
	}
	return singleton;
}	
protected Object clone() {
	return singleton;
}

	

public static void main(String[] args) throws CloneNotSupportedException {
Singleton obj1=Singleton.getInstance();
Singleton obj2=(Singleton)obj1.clone();

System.out.println(obj1.hashCode());
System.out.println(obj1.hashCode());
}
}
