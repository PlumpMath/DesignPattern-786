package zjj.dp.template.example.bankaccount;

public abstract class Account {
	protected double interest;
	
	public Account(double interest) {
		super();
		this.interest = interest;
	}
	
	//公共函数
	public boolean validate(String account,String password) {
		System.out.println("username:"+account+"password:"+password);
		if(account.equals("zjj")&&password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
	//抽象函数，子类细化
	public abstract double calculateInterest();
	
	public void display() {
		System.out.println("Show the interest:"+interest);
	}
	
	//模板函数
	public void handle(String account,String password) {
		if(!validate(account,password)) {
			System.out.println("Error:username or password error!");
			return;
		}
		interest = calculateInterest();
		if(isNotCurrent()) {
			display();		
		}
	}
	
	//钩子函数
	public boolean isNotCurrent() {
		return true;
	}
}
