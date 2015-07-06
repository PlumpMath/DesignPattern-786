package zjj.dp.prototype.clone;

public class ProductB implements IProduct,Cloneable {
	public String property;
	public ProductA productA;
	
	public ProductB(String property,ProductA productA) {
		super();
		this.property = property;
		this.productA = productA;
	}
	
	@Override
	public void method() {
		System.out.println("ProductB.method");	
	}
	
	public IProduct clone() {
		try {
			Object obj = null;
			obj = super.clone();
			return (IProduct) obj;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
