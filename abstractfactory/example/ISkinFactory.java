package zjj.dp.abstractfactory.example;
/*
 * author: zjj
 * date: 2015/5/7
 * func: ����Ƥ������ĳ��󹤳�
 */
public interface ISkinFactory {
	public IButton createButton();
	public ITextField createTextField();
	public IComboBox createComboBox();
}
