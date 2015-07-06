package zjj.dp.command.example.requestlog;

public class ModifyCommand extends AbstractCommand {
	
	public ModifyCommand(String commandName) {
		super(commandName);
	}
	
	@Override
	public void execute() {
		this.configOperation.modify(args);
	}

	@Override
	public void execute(String args) {
		this.args = args;
		this.configOperation.modify(args);
	}

}
