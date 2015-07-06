package zjj.dp.abstractfactory.example;
/*
 * author: zjj
 * date: 2015/5/7
 * func: 生产皮肤界面的抽象工厂
 */
public interface ISkinFactory {
	public IButton createButton();
	public ITextField createTextField();
	public IComboBox createComboBox();
}
