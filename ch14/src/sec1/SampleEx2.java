package sec1;

public class SampleEx2 extends Thread {
	int seq;
	public SampleEx2(int seq){
		this.seq = seq;
	}
	public void run(){
		try {
			Thread.sleep(2000);	//쓰레드의 대기 명령
		} catch(Exception e){
			System.out.println("쓰레드를 대기시키지 못했습니다.");
		}
		System.out.println(this.seq+"번 쓰레드가 실행중입니다.");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			Thread t1 = new SampleEx2(i);
			t1.start();
		}
		System.out.println("main 메소드 실행 시작");
	}
}
