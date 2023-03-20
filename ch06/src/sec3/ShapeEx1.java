package sec3;

public class ShapeEx1 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.setShapeType(0);	//0, 3, 4
		double res1 = s1.calcArea(10);
		System.out.println("반지름이 10인 원의 넓이 : "+res1);
		s1.setShapeType(3);
		res1 = s1.calcArea(10, 15);
		System.out.println("가로 10, 세로 15인 삼각형의 넓이 : "+res1);
		s1.setShapeType(4);
		res1 = s1.calcArea(12, 17);
		System.out.println("가로 12, 세로 17인 사각형의 넓이 : "+res1);
		s1.setShapeType(5);
		System.out.println();
	}

}
