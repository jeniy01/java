package structual.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
	   @Override
	   public void playVlc(String fileName) {
		   //System.out.println("비디오 플레이어 재생 : "+ fileName);
	   }

	   @Override
	   public void playMp4(String fileName) {
		   System.out.println("MP4 플레이어 재생 : "+ fileName);		
	   }
}
