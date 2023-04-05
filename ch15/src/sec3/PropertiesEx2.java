package sec3;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) {
		Properties pro1 = new Properties();
		try{
			pro1.load(PropertiesEx1.class.getResourceAsStream("db.properties"));
			System.out.println("드라이버 : "+pro1.getProperty("driver"));
			System.out.println("URL : "+pro1.getProperty("url"));
			System.out.println("사용자 아이디 : "+pro1.getProperty("username"));
			System.out.println("사용자 비밀번호 : "+pro1.getProperty("password"));
			pro1.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
