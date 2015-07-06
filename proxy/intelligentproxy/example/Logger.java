package zjj.dp.proxy.intelligentproxy.example;

import java.util.Date;

public class Logger {
	public void Log(String userid) {
		System.out.println(userid +"查询次数加1 "+new Date());
	}
}
