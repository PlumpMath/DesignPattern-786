package zjj.dp.abstractfactory.example;
/*
 * author: zjj
 * date: 2015/5/7
 * func: ����WindowsƤ������ĳ��󹤳�
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
