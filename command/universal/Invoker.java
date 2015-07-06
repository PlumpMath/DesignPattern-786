package zjj.dp.command.universal;
/*
 * author: zjj
 * date: 2015/5/17
 * func: �������ߣ�����Ŀ��command
 */
public class Invoker {
	private ICommand command;

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public Invoker(ICommand command) {
		super();
		this.command = command;
	}
	
	public void call() {
		command.execute();
	}
}
