package zjj.dp.iterator.example.productlist;

import java.util.List;

/*
 * author: zjj
 * date: 2015/6/6
 * func: 元素集合接口，负责管理元素的增删查改
 */
public interface IObjectList {
	public void add(Object obj);
	public void remove(Object obj);
	public List getObjects();
	public Iterator createIterator();
}
