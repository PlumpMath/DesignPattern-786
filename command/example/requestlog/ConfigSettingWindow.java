package zjj.dp.command.example.requestlog;

import java.util.ArrayList;
import java.util.List;

import zjj.dp.command.example.requestlog.util.FileUtil;
/*
 * author: zjj
 * date: 2015/5/17
 * func:配置文件操作控制类
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
	
	//保存操作集合
	public void save() {
		fileUtil.writeLog(commands);
	}
	
	//恢复操作集合
	public void recover() {
		List<AbstractCommand> list = fileUtil.readLog();
		for(AbstractCommand command:list) {
			command.execute();
		}
	}
}
