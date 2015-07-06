package zjj.dp.status.example.bankaccount;

public class OverdrawStatus implements Status {
	private static final String NAME = "OVERDRAW STATUS";
	
	public String getStatusName() {
		return NAME;
	}
}
