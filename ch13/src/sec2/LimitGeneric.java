package sec2;
//타입이 제한된 범용 클래스 : 숫자타입이나 문자, 논리값 등 특정 타입만 허용되도록 하는 범용 클래스
public class LimitGeneric<N extends Number> {
	public N field1;
}
