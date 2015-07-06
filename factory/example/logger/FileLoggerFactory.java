package zjj.dp.factory.example.logger;

public class FileLoggerFactory extends AbstractFactory {
	@Override
	public ILogger createLogger() {
		return new FileLogger();
	}

}
