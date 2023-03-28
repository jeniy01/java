package creational.prototype;

public class Rectangle extends Shape {

	   public Rectangle(){
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("직사각형을 그립니다.");
	   }
}
