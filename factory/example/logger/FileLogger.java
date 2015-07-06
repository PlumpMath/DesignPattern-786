package zjj.dp.factory.example.logger;

public class FileLogger implements ILogger {

	@Override
	public void writeLog() {
		System.out.println("FileLogger.writeLog");
	}

}
