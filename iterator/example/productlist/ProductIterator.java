package zjj.dp.iterator.example.productlist;

import java.util.List;

public class ProductIterator implements Iterator {
	private ProductList productList;
	private List<Object> products;
	private int cursor1;
	private int cursor2;
	public ProductIterator(ProductList productList) {
		this.productList = productList;
		this.products = productList.getObjects();
		this.cursor1 = 0;
		this.cursor2 = products.size()-1;
	}
	
	@Override
	public boolean hasNext() {
		if(cursor1<products.size()) return true;
		return false;
	}

	@Override
	public Object next() {
		return products.get(cursor1++);
	}

	@Override
	public boolean hasPrevious() {
		if(cursor2>-1) return true;
		return false;
	}

	@Override
	public Object previous() {
		return products.get(cursor2--);
	}

}
