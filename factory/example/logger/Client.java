package zjj.dp.factory.example.logger;

import zjj.dp.factory.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/7
 * func: 测试生产数据库和文件两种日志记录器的工厂模式
 * 配置文件为LoggerConfig.xml
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = (AbstractFactory) XMLUtil.getBean();
		ILogger logger = factory.createLogger();
		logger.writeLog();
	}

}
