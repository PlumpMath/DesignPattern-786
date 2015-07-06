package zjj.dp.template.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: 模板抽象类，包含子类公用的方法
 */
public abstract class ParentModel {
	
	protected abstract void method1();
	protected abstract void method2();
	//子类公用的方法
	protected final void common_method()
	{
		if(isFlag()) this.method1();
		this.method2();
	}	
	
	//钩子方法，影响公共方法的执行结果
	protected boolean isFlag()
	{
		return true;
	}
	
	
}
