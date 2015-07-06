package zjj.dp.abstractfactory.example;
/*
 * author: zjj
 * date: 2015/5/7
 * func: 生产Windows皮肤界面的抽象工厂
 */
public class WindowsSkinFactory implements ISkinFactory {

	@Override
	public IButton createButton() {
		return new WindowsButton();
	}

	@Override
	public ITextField createTextField() {
		return new WindowsTextField();	
	}

	@Override
	public IComboBox createComboBox() {
		return new WindowsComboBox();	
	}

}
