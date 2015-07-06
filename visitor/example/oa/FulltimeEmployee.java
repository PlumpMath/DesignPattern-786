package zjj.dp.visitor.example.oa;

public class FulltimeEmployee implements IEmployee {
	private String name;
	private int weekWage;
	private int workTime;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getweekWage() {
		return weekWage;
	}

	public void setweekWage(int weekWage) {
		this.weekWage = weekWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public FulltimeEmployee(String name, int weekWage, int workTime) {
		super();
		this.name = name;
		this.weekWage = weekWage;
		this.workTime = workTime;
	}
	
	@Override
	public void accept(IDepartment department) {
		department.visit(this);
	}

}
