package zjj.dp.command.universal;
/*
 * author: zjj
 * date: 2015/5/17
 * func: 具体命令类，持有请求处理者的引用
 */
public class ConcreteCommand implements ICommand {
	private Reciver reciver;
	
	public ConcreteCommand(Reciver reciver) {
		super();
		this.reciver = reciver;
	}

	@Override
	public void execute() {
		reciver.action();
	}

}
