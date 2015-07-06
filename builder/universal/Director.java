package zjj.dp.builder.universal;

import java.util.ArrayList;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ������,�����Ų�ͬ�Ĳ�Ʒ����������Ʒ�����н����߶���
 */
public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private ProductABuilder productABuilder = new ProductABuilder();
	private ProductBBuilder productBBuilder = new ProductBBuilder();
	public SubModelA getProductABySeq1()
	{
		this.sequence.clear();		//ע�����������
		this.sequence.add("method1");
		this.sequence.add("method3");
		this.sequence.add("method2");
		productABuilder.setSequence(this.sequence);
		return (SubModelA) productABuilder.getModel();
	}
	
	public SubModelA getProductABySeq2()
	{
		this.sequence.clear();		//ע�����������
		this.sequence.add("method2");
		this.sequence.add("method1");
		this.sequence.add("method3");
		productABuilder.setSequence(this.sequence);
		return (SubModelA) productABuilder.getModel();
	}
	
	public SubModelB getProductBBySeq1()
	{
		this.sequence.clear();		//ע�����������
		this.sequence.add("method2");
		this.sequence.add("method3");
		this.sequence.add("method1");
		productBBuilder.setSequence(this.sequence);
		return (SubModelB) productBBuilder.getModel();
	}
	
	public SubModelB getProductBBySeq2()
	{
		this.sequence.clear();		//ע�����������
		this.sequence.add("method1");
		this.sequence.add("method2");
		this.sequence.add("method3");
		productBBuilder.setSequence(this.sequence);
		return (SubModelB) productBBuilder.getModel();
	}
	
}
