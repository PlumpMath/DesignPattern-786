package zjj.dp.command.example.functionbundle;

import java.util.ArrayList;
import java.util.List;

public class FunctionSettingWindow {
	private String title;
	private List<FunctionButton> list = new ArrayList<FunctionButton>();
	
	public FunctionSettingWindow(String title) {
		this.title = title;
	}
	
	public void addFunctionButton(FunctionButton fb) {
		list.add(fb);
	}
	
	public void removeFunctionButton(FunctionButton fb) {
		list.remove(fb);
	}
	
	public void display() {
		System.out.println("Show Window:"+this.title);
		System.out.println("Show FunctionButton:");
		for(FunctionButton fb:list) {
			System.out.println(fb.getButtonName());
		}
	}
}
