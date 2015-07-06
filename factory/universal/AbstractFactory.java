package zjj.dp.factory.universal;

public abstract class AbstractFactory {
	public abstract <T extends IProduct>T createProduct(Class<T> c);
}
