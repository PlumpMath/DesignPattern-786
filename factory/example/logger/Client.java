package zjj.dp.factory.example.logger;

import zjj.dp.factory.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/7
 * func: �����������ݿ���ļ�������־��¼���Ĺ���ģʽ
 * �����ļ�ΪLoggerConfig.xml
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = (AbstractFactory) XMLUtil.getBean();
		ILogger logger = factory.createLogger();
		logger.writeLog();
	}

}
