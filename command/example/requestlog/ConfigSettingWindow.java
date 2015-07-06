package zjj.dp.command.example.requestlog;

import java.util.ArrayList;
import java.util.List;

import zjj.dp.command.example.requestlog.util.FileUtil;
/*
 * author: zjj
 * date: 2015/5/17
 * func:�����ļ�����������
 */
public class ConfigSettingWindow {
	private List<AbstractCommand> commands = new ArrayList<AbstractCommand>();
	private FileUtil fileUtil = new FileUtil();
	private AbstractCommand command;
	
	public void setAbstractCommand(AbstractCommand command) {
		this.command = command;
	}
	
	public void call(String args) {
		command.execute(args);
		commands.add(command);
	}
	
	//�����������
	public void save() {
		fileUtil.writeLog(commands);
	}
	
	//�ָ���������
	public void recover() {
		List<AbstractCommand> list = fileUtil.readLog();
		for(AbstractCommand command:list) {
			command.execute();
		}
	}
}
