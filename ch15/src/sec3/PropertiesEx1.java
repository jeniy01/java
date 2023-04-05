package sec3;

import java.io.IOException;
import java.util.Properties;

//.load() 메소드에 의해 현재 클래스로 특정 .properties 파일을 가져온다.
public class PropertiesEx1 {
	public static void main(String[] args) {
		Properties pro1 = new Properties();
		try{
			pro1.load(PropertiesEx1.class.getResourceAsStream("css.properties"));
			System.out.println("글자크기 : "+pro1.getProperty("fontSize"));
			System.out.println("글자색 : "+pro1.getProperty("color"));
			System.out.println("배경색 : "+pro1.getProperty("backgroundColor"));
			System.out.println("안 여백 : "+pro1.getProperty("margin"));
			System.out.println("바깥 여백 : "+pro1.getProperty("padding"));
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
