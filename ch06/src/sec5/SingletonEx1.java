package sec5;
//싱글톤(Singleton)
public class SingletonEx1 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//static이기 때문에 s1 = s2, 아무리 많이 만들어도 똑같이 하나로 통일
		System.out.println(s1==s2);
	}
}
