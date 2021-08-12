package exercise7;

public class LoginExanple {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
	if(!id.equals("blue")) { //if(id.equals("blue") != true)
		throw new NotExistIDException("ID not found...");
	}
	
	//password�� "12345" �ƴϸ� WrongPasswordException �߻���Ŵ
	if(!password.equals("12345")) { //if(password.equals("12345") != true){
		throw new WrongPasswordException("Invalid password...");
	}
	}

}
