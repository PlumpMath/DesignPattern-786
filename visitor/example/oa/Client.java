package zjj.dp.visitor.example.oa;

/*
 * author: zjj
 * date: 2015/7/6
 * func:访问者模式实例，OA系统不同部门对员工信息的访问处理
 */
public class Client {
		
	public static void main(String[] args) {
		IEmployee fe1 = new FulltimeEmployee("Jamon", 5000, 80);
		IEmployee fe2 = new FulltimeEmployee("Robin", 3000, 30);
		IEmployee pe1 = new ParttimeEmployee("Lily", 120, 40);
		IEmployee pe2 = new ParttimeEmployee("Nancy", 100, 40);
		EmployeeList elist = new EmployeeList();
		elist.addEmployee(fe1);
		elist.addEmployee(fe2);
		elist.addEmployee(pe1);
		elist.addEmployee(pe2);
		
		IDepartment fadep = new FADepartment();
		elist.accept(fadep);
		IDepartment hrdep = new HRDepartment();
		elist.accept(hrdep);
	}
	
}
