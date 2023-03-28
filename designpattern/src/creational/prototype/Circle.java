package creational.prototype;

public class Circle extends Shape {
   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("원을 그립니다.");
   }
}
