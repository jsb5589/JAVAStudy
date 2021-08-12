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
			String msg = String.format("�ܰ����:(%d)���� �����մϴ�.", (money-balance));
			BalanceInsuffcientException exception = new BalanceInsuffcientException(msg);
			exception.setBalance(this);
			throw exception;
			
			//throw new BalanceInsuffcientException(msg);
			//throw new BalanceInsuffcientException("�ܰ����:"+(money-balance)+" ���ڶ�");
		}
		this.balance -= money;
	}
}
