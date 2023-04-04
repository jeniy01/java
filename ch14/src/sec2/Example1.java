package sec2;

public class Example1 {
	public static void main(String[] args) {
		Thread1 ex1 = new Thread1();
		Thread1 ex2 = new Thread1();
		Thread t1 = new Thread(ex1, "A");
		Thread t2 = new Thread(ex2, "B");
		
		t1.start();
		t2.start();
		
		Thread.currentThread().getName();
	}
}
