package userexception.balance;

public class BalanceInsuffcientException extends Exception {
	private Account account;
	
	public BalanceInsuffcientException() {}
	public BalanceInsuffcientException(String message) {
		super(message);
	}
	
	public long getBalance() {
		return this.account.getBalance();
	}
	
	public void setBalance(Account account) {
		this.account = account;
	}
	
	public void balanceAccount(String title) {
		System.out.println(title + ": " + this.account.getBalance());
	}
	
}
