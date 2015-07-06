package zjj.dp.visitor.example.oa;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	private List<IEmployee> employees = new ArrayList<IEmployee>();
	
	public void addEmployee(IEmployee e) {
		employees.add(e);
	}
	
	public void accept(IDepartment dep) {
		for(IEmployee e:employees) {
			e.accept(dep);
		}
	}
}
