package sec2;

public class FoodEx1 {
	public static void main(String[] args) {
		//생성자 함수 : 클래스 이름과 같으며, 오버로딩을 통하여 여러 형태로 정의한 후 사용할 수 있고, 해당 매개변수의 개수만큼 다양한 방법으로 객체 생성 가능
		Food f0 = new Food();
		Food f1 = new Food("불고기덮밥");
		Food f2 = new Food("부대찌개", 450);
		Food f3 = new Food("치즈돈까스", 510, 9000);
		f0.setName("육개장칼국수"); //setter에 의해 초기화
		System.out.println(f0.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}
}
