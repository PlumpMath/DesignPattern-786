package zjj.dp.abstractfactory.example;

import zjj.dp.abstractfactory.example.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/7
 * func: 测试生产windows,linux皮肤界面的抽象工厂模式
 * 配置文件为SkinConfig.xml
 */
public class Client {

	public static void main(String[] args) {
		ISkinFactory skinFactory;
		IButton button;
		ITextField textField;
		IComboBox comboBox;
		skinFactory = (ISkinFactory) XMLUtil.getBean();
		button = skinFactory.createButton();
		textField = skinFactory.createTextField();
		comboBox = skinFactory.createComboBox();
		button.showButton();
		textField.showTextField();
		comboBox.showComboBox();
	}

}
