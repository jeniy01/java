package sec2;
//다중상속
//User+Guest=Mix
//클래스들간의 관계가 쓸데없이 혼잡해질 수 있으므로 자바에서는 다중상속을 가급적 사용하지 않는다.
public interface Mix extends User, Guest{
	public void method5();
	public void method6();
}
