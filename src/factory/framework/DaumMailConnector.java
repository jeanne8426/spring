package factory.framework;

import java.util.Date;

public class DaumMailConnector extends SMTPConnector {

	public DaumMailConnector(String url, String id, String password, Date connectTime) {
		super(url, id, password, connectTime);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void connect() {
		System.out.println("다음 SMTP서버와 연결에 성공했습니다.");
	}
}
