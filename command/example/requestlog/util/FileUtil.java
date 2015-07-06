package zjj.dp.command.example.requestlog.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import zjj.dp.command.example.requestlog.AbstractCommand;

public class FileUtil {
	public void writeLog(List<AbstractCommand> commands) {
		try {
			FileOutputStream fos = new FileOutputStream("src\\zjj\\dp\\command\\example\\requestlog\\config.log");
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(fos));
			oos.writeObject(commands);
			
			oos.close();
		} catch (Exception e) {
			System.out.println("writeLog fail");
			e.printStackTrace();
		}
	}
	
	public List<AbstractCommand> readLog() {	
		try {
			FileInputStream fis = new FileInputStream("src\\zjj\\dp\\command\\example\\requestlog\\config.log");
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(fis));
			List<AbstractCommand> list = (List<AbstractCommand>) ois.readObject();
			ois.close();
			return list;
		} catch (Exception e) {
			System.out.println("readLog fail");
			e.printStackTrace();
			return null;
		}
		
	}
}
