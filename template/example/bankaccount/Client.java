package zjj.dp.template.example.bankaccount;

/*
 * author: zjj
 * date: 2015/7/5
 * func:模板模式实例，根据用户不同的
 */
public class Client {
		
	public static void main(String[] args) {
		Account account = new SavingAccount(1000);
		account.handle("zjj", "123");
		
		Account account2 = new CurrentAccount(1000);
		account2.handle("zjj", "123");
	}
	
}
