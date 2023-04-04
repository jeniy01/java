package sec2;

public class Thread1 implements Runnable {
	int testNum = 0;

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			if(Thread.currentThread().getName().equals("A")){
				System.out.println("*******************");
				testNum++;
			}
			System.out.println("ThreadName = "+Thread.currentThread().getName());
			System.out.println(testNum+"번째");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	//이 문장은 해도 되고 안해도 됨
			}
		}
	}
}
