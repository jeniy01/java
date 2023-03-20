package sec2;

public class FoodEx2 {
	public static void main(String[] args) {
		//생성자함수 = 클래스 이름
		Food2 f0 = new Food2();
		Food2 f1 = new Food2("불고기덮밥");
		Food2 f2 = new Food2("부대찌개", 450);
		Food2 f3 = new Food2("치즈돈까스", 510, 9000);
		
		System.out.println(f0.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}

}
