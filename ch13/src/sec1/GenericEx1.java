package sec1;

public class GenericEx1 {
	public static void main(String[] args) {
		Generic<User> u1 = new Generic<>();
		User obj1 = new User();
		obj1.setUname("이동혁");
		obj1.setUno(22);
		obj1.setUid("fullsun");
		u1.obj = obj1;
		System.out.println(u1.obj.toString());
		
		Generic<Administrator> a1 = new Generic<>();
		Administrator obj2 = new Administrator();
		obj2.setGrade("3");
		obj2.setAno(66);
		obj2.setName("이동혁");
		a1.obj = obj2;
		System.out.println(a1.obj.toString());
	}
}
