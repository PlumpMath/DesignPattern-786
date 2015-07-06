package zjj.dp.template.example.bankaccount;

public class CurrentAccount extends Account {

	public CurrentAccount(double interest) {
		super(interest);
	}

	@Override
	public double calculateInterest() {
		System.out.println("按活期利息计算");
		return this.interest*1.1;
	}
	
	public boolean isNotCurrent() {
		return false;
	}
}
