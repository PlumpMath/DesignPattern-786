package zjj.dp.status.example.bankaccount;

public class RestrictiveStatus implements Status {

	private static final String NAME = "RESTRICTIVE STATUS";
	
	public String getStatusName() {
		return NAME;
	}

}
