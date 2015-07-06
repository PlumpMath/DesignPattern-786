package zjj.dp.command.universal;
/*
 * author: zjj
 * date: 2015/5/17
 * func: ���������࣬�����������ߵ�����
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
