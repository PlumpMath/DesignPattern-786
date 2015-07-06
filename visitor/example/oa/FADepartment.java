package zjj.dp.visitor.example.oa;

public class FADepartment implements IDepartment {

	@Override
	public void visit(FulltimeEmployee employee) {
		int weekWage = employee.getweekWage();
		int workTime = employee.getWorkTime();
		int wage = 0;
		if(workTime>40) {
		    wage = weekWage + (workTime - 40) * 100;
		}else {
			wage = weekWage - (40 - workTime) * 80;
			if(wage<0) wage = 0;
		}
		System.out.println("full-time employee:"+employee.getName()+" wage is "+wage);
	}

	@Override
	public void visit(ParttimeEmployee employee) {
		int hourWage = employee.getHourWage();
		int workTime = employee.getWorkTime();
		
		int wage = hourWage*workTime;
		System.out.println("part-time employee:"+employee.getName()+" wage is "+wage);
	}

}
