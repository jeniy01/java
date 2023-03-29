package structual.adapter;

public class AudioPlayer  implements MediaPlayer {
	   MediaAdapter mediaAdapter; 

	   @Override
	   public void play(String audioType, String fileName) {		

	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("MP3 플레이어 재생 : " + fileName);			
	      } 
	      
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      
	      else{
	         System.out.println("재생을 요청한 " + audioType + "은 지원하지 않는 형식입니다.");
	      }
	   }   
}
