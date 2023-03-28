package creational.prototype;

public class Square extends Shape {

	   public Square(){
	     type = "Square";
	   }

	   @Override
	   public void draw() {
	      System.out.println("정사각형을 그립니다.");
	   }
}
