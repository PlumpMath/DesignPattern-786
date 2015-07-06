package zjj.dp.mediator.example.guidriver;

/*
 * author: zjj
 * date: 2015/6/6
 * func:中介者模式实例，GUI界面事件驱动联动响应
 */
public class Client {

	public static void main(String[] args) {
		Button button = new Button();
		ComboBox comboBox = new ComboBox();
		List list = new List();
		
		IMediator mediator = new ConcreteMediator(button,comboBox,list);
		button.setMediator(mediator);
		comboBox.setMediator(mediator);
		list.setMediator(mediator);
		button.add("RED");
		
		list.select("BLUE");
		
		
	}
}
