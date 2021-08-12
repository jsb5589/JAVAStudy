package userexception.balance;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsuffcientException{
		if(this.balance < money) {
			String msg = String.format("잔고부족:(%d)원이 부족합니다.", (money-balance));
			BalanceInsuffcientException exception = new BalanceInsuffcientException(msg);
			exception.setBalance(this);
			throw exception;
			
			//throw new BalanceInsuffcientException(msg);
			//throw new BalanceInsuffcientException("잔고부족:"+(money-balance)+" 모자람");
		}
		this.balance -= money;
	}
}
