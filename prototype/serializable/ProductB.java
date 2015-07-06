package zjj.dp.prototype.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ProductB implements IProduct,Serializable {
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
		System.out.println("ProductB.property:"+this.property);
		System.out.println("ProductB.productA.property:"+this.property);
	}
	
	public IProduct deepClone() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (IProduct) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}	
}
