package factory.framework;

import java.util.Date;

public class GoogleMailConnector extends SMTPConnector {

	public GoogleMailConnector(String url, String id, String password, Date connectTime) {
		super(url, id, password, connectTime);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void connect() {
		System.out.println("구글 SMTP서버와 연결에 성공했습니다.");
	}

}
