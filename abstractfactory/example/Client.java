package zjj.dp.abstractfactory.example;

import zjj.dp.abstractfactory.example.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/7
 * func: ��������windows,linuxƤ������ĳ��󹤳�ģʽ
 * �����ļ�ΪSkinConfig.xml
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
