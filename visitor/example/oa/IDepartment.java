package zjj.dp.visitor.example.oa;

public interface IDepartment {
	public void visit(FulltimeEmployee employee);
	public void visit(ParttimeEmployee employee);
}
