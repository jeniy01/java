package sec3;

public class WildGenericEx1 {
	public static void main(String[] args) {
		WildGeneric<Board> n1 = new WildGeneric<Board>();
		WildGeneric<Notice> n2 = new WildGeneric<>();
		WildGeneric<DataRoom> n3 = new WildGeneric<>();
		//WildGeneric<Qna> n4 = new WildGeneric<>();
	}
}
