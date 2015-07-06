package zjj.dp.factory.example.logger;

public class DatabaseLoggerFactory extends AbstractFactory {

	@Override
	public ILogger createLogger() {
		return new DatabaseLogger();
	}

}
