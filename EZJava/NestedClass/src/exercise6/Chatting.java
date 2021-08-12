package exercise6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "Hi";
					String msg = "[" + nickName + "]" + inputData;
					// String msg = "[" + chatId + "]" + inputData;
					send(msg);
				}
			}
		};
		chat.start();
	}
	public class Chat{
		void start() {}
		void send(String msg) {}
	}

}
