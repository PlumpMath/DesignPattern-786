package zjj.dp.abstractfactory.example;
/*
 * author: zjj
 * date: 2015/5/7
 * func: 生产Linux皮肤界面的抽象工厂
 */
public class LinuxSkinFactory implements ISkinFactory {

	@Override
	public IButton createButton() {
		return new LinuxButton();
	}

	@Override
	public ITextField createTextField() {
		return new LinuxTextField();	
	}

	@Override
	public IComboBox createComboBox() {
		return new LinuxComboBox();	
	}

}
