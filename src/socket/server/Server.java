package socket.server;

import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000); // 5000 포트로 서버 실행.
			
			while(server.isClosed() == false) // 서버가 닫힐 때 까지 반복
				server.accept(); // client의 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
