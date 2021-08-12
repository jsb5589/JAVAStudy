package userexception.balance;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		balanceAccount("현재잔고" ,account);
	
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInsuffcientException e) {
			System.out.println("예외:" + e.getMessage());
			e.printStackTrace();
			
		}

	}
	
	static void balanceAccount(String title, Account account) {
		System.out.println(title + ": " + account.getBalance());
	}

}
