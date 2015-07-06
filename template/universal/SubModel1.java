package zjj.dp.template.universal;

public class SubModel1 extends ParentModel {
	private boolean isMethod1Flag = true;
	@Override
	protected void method1() {
		System.out.println("SubModel1.method1");	
	}

	@Override
	protected void method2() {
		System.out.println("SubModel1.method2");	
	}

	public void setMethod1Flag(boolean flag)
	{
		this.isMethod1Flag = flag;
	}
	
	protected boolean isFlag()
	{
		return this.isMethod1Flag;
	}
}
