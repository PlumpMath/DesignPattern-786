package zjj.dp.decorate.example;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 装饰模式实例，给窗口显示装饰滚动条，黑色边框
 */
public class Client {

	public static void main(String[] args) {
		Component c = new Window();
		Decorator d1 = new ScrollBarDecorator(c);
		Decorator d2 = new BlackBorderDecorator(d1);
		d2.display();
	}
}
