package sec2;

public class LimitGenericEx1 {
	public static void main(String[] args) {
		LimitGeneric<Integer> a1 = new LimitGeneric<Integer>();
		a1.field1 = 1004;
		
		LimitGeneric<Double> a2 = new LimitGeneric<>();
		a2.field1 = 3.14;
	}
}
