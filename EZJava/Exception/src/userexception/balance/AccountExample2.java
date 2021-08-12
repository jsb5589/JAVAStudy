package userexception.balance;

public class AccountExample2 {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		balanceAccount("ÇöÀçÀÜ°í" ,account);
	
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInsuffcientException e) {
			e.balanceAccount("ÀÜ°í ¿À·ù");
			
		}

	}
	
	static void balanceAccount(String title, Account account) {
		System.out.println(title + ": " + account.getBalance());
	}

}
