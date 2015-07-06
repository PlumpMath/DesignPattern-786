package zjj.dp.iterator.example.productlist;
/*
 * author: zjj
 * date: 2015/6/6
 * func:迭代器接口，负责遍历集合元素
 */
public interface Iterator {
	public boolean hasNext();
	public Object next();
	public boolean hasPrevious();
	public Object previous();
}
