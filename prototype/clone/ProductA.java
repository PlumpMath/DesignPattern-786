package zjj.dp.prototype.clone;

public class ProductA implements IProduct,Cloneable  {
	public String property;
	
	public ProductA(String property) {
		super();
		this.property = property;
	}
	public void method() {
		System.out.println("ProductA.method");
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
