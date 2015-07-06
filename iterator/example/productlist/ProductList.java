package zjj.dp.iterator.example.productlist;

import java.util.List;

public class ProductList implements IObjectList {
	private List<Object> list;
	
	public ProductList(List<Object> list) {
		this.list = list;
	}
	
	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}

	@Override
	public List getObjects() {
		return list;
	}

	@Override
	public ProductIterator createIterator() {
		return new ProductIterator(this);
	}

}
