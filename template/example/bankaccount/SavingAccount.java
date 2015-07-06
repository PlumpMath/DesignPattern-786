package zjj.dp.template.example.bankaccount;

public class SavingAccount extends Account {

	public SavingAccount(double interest) {
		super(interest);
	}

	@Override
	public double calculateInterest() {
		System.out.println("按定期利息计算");
		return this.interest*1.2;
	}

}
