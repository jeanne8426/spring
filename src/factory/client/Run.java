package factory.client;

import factory.framework.ConnectorFactory;
import factory.framework.SMTPConnector;

public class Run {
	
	public static void main(String[] args) {
		
		//네이버 SMTP서버에 연결을 해보자
	try {
		SMTPConnector conn = ConnectorFactory.builder()
				.url("smpt.naver.com")
				.id("jeanne8426@naver.com")
				.password("123456")
				.build()
				.getConnector();
			conn.connect();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
