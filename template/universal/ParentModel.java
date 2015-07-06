package zjj.dp.template.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ģ������࣬�������๫�õķ���
 */
public abstract class ParentModel {
	
	protected abstract void method1();
	protected abstract void method2();
	//���๫�õķ���
	protected final void common_method()
	{
		if(isFlag()) this.method1();
		this.method2();
	}	
	
	//���ӷ�����Ӱ�칫��������ִ�н��
	protected boolean isFlag()
	{
		return true;
	}
	
	
}
