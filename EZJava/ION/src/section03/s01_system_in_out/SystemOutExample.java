package section03.s01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;		
		
		for(byte b=48; b<58; b++) { // ����(0~9)
			os.write(b);
		}		
		os.write(10); // LF(Line Feed)
		
		for(byte b=97; b<123; b++) { // ���ĺ�(a~z)
			os.write(b);
		}		
		os.write(10); // LF(Line Feed)

		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}
}

