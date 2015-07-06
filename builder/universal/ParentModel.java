package zjj.dp.builder.universal;

import java.util.ArrayList;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ��Ʒ�����࣬�������в�Ʒ������ʹ�÷��������ù������̵ķ���
 */
public abstract class ParentModel {
	private ArrayList<String> sequence = new ArrayList<String>();
	protected abstract void method1();
	protected abstract void method2();
	protected abstract void method3();
	public final void run() 
	{
		for(int i=0;i<this.sequence.size();i++)
		{
			String methodName = sequence.get(i);
			if(methodName.equalsIgnoreCase("method1")) this.method1();
			else if(methodName.equalsIgnoreCase("method2")) this.method2();
			else if(methodName.equalsIgnoreCase("method3")) this.method3();
		}
	}
	
	public final void setSequence(ArrayList<String> sequence)
	{
		this.sequence = sequence;
	}
}
