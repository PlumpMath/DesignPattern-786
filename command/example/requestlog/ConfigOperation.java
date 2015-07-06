package zjj.dp.command.example.requestlog;

import java.io.Serializable;
/*
 * author: zjj
 * date: 2015/5/17
 * func:配置文件操作类
 */
public class ConfigOperation implements Serializable{
	public void insert(String args) {
		System.out.println("insert "+args);
	}
	
	public void modify(String args) {
		System.out.println("modify "+args);
	}
	
	public void delete(String args) {
		System.out.println("delete "+args);
	}
}
