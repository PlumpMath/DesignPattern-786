package zjj.dp.command.example.functionbundle;

import zjj.dp.command.example.functionbundle.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/17
 * func:命令模式实例，自定义功能键
 */
public class Client {

	public static void main(String[] args) {
		FunctionSettingWindow fsw = new FunctionSettingWindow("FunctionButton setting windows");
		FunctionButton button1 = new FunctionButton("open doc");
		FunctionButton button2 = new FunctionButton("minimize window");

		ICommand helpercommand = (ICommand) XMLUtil.getBean(0);
		ICommand minimizeCommand = (ICommand) XMLUtil.getBean(1);
		button1.setCommand(helpercommand);
		button2.setCommand(minimizeCommand);
		fsw.addFunctionButton(button1);
		fsw.addFunctionButton(button2);
		fsw.display();
		
		button1.click();
		button2.click();
	}
}
