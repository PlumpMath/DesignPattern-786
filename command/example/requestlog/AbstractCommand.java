package zjj.dp.command.example.requestlog;

import java.io.Serializable;

public abstract class AbstractCommand implements Serializable {
	private String commandName;
	protected String args;
	protected ConfigOperation configOperation;
	
	public AbstractCommand(String commandName) {
		this.commandName = commandName;
	}
	
	public void setConfigOperation(ConfigOperation configOperation) {
		this.configOperation = configOperation;
	}
	
	public abstract void execute();
	public abstract void execute(String args);
}
