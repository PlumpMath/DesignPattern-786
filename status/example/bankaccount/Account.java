package zjj.dp.status.example.bankaccount;

public class Account {
	private String accountName;
	private double balance;
	private Status status,normalStatus,overdrawStatus,restrictiveStatus;
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Account(String accountName) {
		normalStatus = new NormalStatus();
		overdrawStatus = new OverdrawStatus();
		restrictiveStatus = new RestrictiveStatus();
		this.accountName = accountName;
		this.balance = 0;
		System.out.println(accountName+"'s account has been opened!");
		System.out.println("balance:"+this.balance);
	}
	
	public void deposit(double amount){
		double newBalance = amount+this.balance;
		if(newBalance>0){
			this.setStatus(normalStatus);
		}else if(newBalance<0&&newBalance>-2000) {
			this.setStatus(overdrawStatus);
		}else if(newBalance<=-2000) {
			this.setStatus(restrictiveStatus);
		}
		
		this.setBalance(newBalance);
		System.out.println("balance:"+this.balance);
		System.out.println("status:"+this.getStatus().getStatusName());
	}
	
	public int withdraw(double amount) {
		double newBalance = this.balance-amount;
		if(newBalance>0){
			this.setStatus(normalStatus);
		}else if(newBalance<0&&newBalance>-2000) {
			this.setStatus(overdrawStatus);
		}else if(newBalance==-2000) {
			this.setStatus(restrictiveStatus);
		}else {
			System.out.println("ERROR:excess the limit!");
			System.out.println("balance:"+this.balance);
			System.out.println("status:"+this.getStatus().getStatusName());
			return 0;
		}
		
		this.setBalance(newBalance);
		System.out.println("balance:"+this.balance);
		System.out.println("status:"+this.getStatus().getStatusName());
		return 1;
	}
}
