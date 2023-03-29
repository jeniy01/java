package structual.adapter;

public class AdapterEx1 {
	public static void main(String[] args) {
		  //Adater(어댑터): 클래스의 인터페이스를 사용자가 원하는 다른 인터페이스 형태로 변환하는 패턴
		  //어떻게든 원하는 타입으로 객체가 자동 변환됨 
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	}
}
