package zjj.dp.command.example.requestlog;

/*
 * author: zjj
 * date: 2015/5/17
 * func:����ģʽʵ����������־�����ڻָ�����
 */
public class Client {

	public static void main(String[] args) {
		ConfigSettingWindow csw = new ConfigSettingWindow();
		AbstractCommand insertCommand = new InsertCommand("Add");
		ConfigOperation co = new ConfigOperation();
		
		insertCommand.setConfigOperation(co);
		csw.setAbstractCommand(insertCommand);
		csw.call("index.html");
		
		AbstractCommand modifyCommand = new ModifyCommand("Add");
		modifyCommand.setConfigOperation(co);
		csw.setAbstractCommand(modifyCommand);
		csw.call("port:8080");
		
		csw.save();
		
		csw.recover();
	}
}
