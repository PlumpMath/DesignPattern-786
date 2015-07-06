package zjj.dp.status.example.bankaccount;

/*
 * author: zjj
 * date: 2015/7/4
 * func:状态模式实例，银行账户余额不同状态
 */
public class Client {
		
	public static void main(String[] args) {
		Account account = new Account("ZJJ");
		account.deposit(1000);
		account.deposit(2000);
		account.withdraw(1000);
		account.withdraw(3000);
		account.withdraw(2000);
		account.withdraw(1000);
		account.withdraw(1000);
		account.deposit(1000);
	}
	
}
