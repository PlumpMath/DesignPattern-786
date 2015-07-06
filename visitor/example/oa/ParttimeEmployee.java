package zjj.dp.visitor.example.oa;

public class ParttimeEmployee implements IEmployee {
	private String name;
	private int hourWage;
	private int workTime;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHourWage() {
		return hourWage;
	}

	public void setHourWage(int hourWage) {
		this.hourWage = hourWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public ParttimeEmployee(String name, int hourWage, int workTime) {
		super();
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}
	@Override
	public void accept(IDepartment department) {
		department.visit(this);
	}


}
