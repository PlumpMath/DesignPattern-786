package zjj.dp.command.example.requestlog;

public class InsertCommand extends AbstractCommand {

	private String commandName;
	
	
	public InsertCommand(String commandName) {
		super(commandName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() {
		this.configOperation.insert(args);
	}

	@Override
	public void execute(String args) {
		this.args = args;
		configOperation.insert(args);
	}

}
