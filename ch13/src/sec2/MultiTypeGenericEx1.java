package sec2;

public class MultiTypeGenericEx1 {
	public static void main(String[] args) {
		Home h1 = new Home();
		MultiTypeGeneric<Home, String> m1 = new MultiTypeGeneric<>();
		h1.type = "아파트";
		m1.setValue(h1.type);
		System.out.println(h1.getClass()+", "+m1.getValue());
		
		Human h2 = new Human();
		MultiTypeGeneric<Human, String> m2 = new MultiTypeGeneric<>();
		h2.type = "유럽인";
		m2.setValue(h2.type);
		System.out.println(h2.getClass()+", "+m2.getValue());
	}
}
