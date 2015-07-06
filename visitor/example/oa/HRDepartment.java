package zjj.dp.visitor.example.oa;

public class HRDepartment implements IDepartment {

	@Override
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		
		System.out.println("full-time employee:"+employee.getName()+" workTime is "+ workTime);
		if(workTime>40) {
			System.out.println("full-time employee:"+employee.getName()+" overtime work workTime is "+ (workTime-40));
		}else if(workTime<40){
			System.out.println("full-time employee:"+employee.getName()+" leave workTime is "+ (40-workTime));
		}

	}

	@Override
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		
		System.out.println("part-time employee:"+employee.getName()+" workTime is "+ workTime);
	}

}
