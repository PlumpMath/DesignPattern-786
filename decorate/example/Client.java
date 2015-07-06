package zjj.dp.decorate.example;
/*
 * author: zjj
 * date: 2015/5/15
 * func: װ��ģʽʵ������������ʾװ�ι���������ɫ�߿�
 */
public class Client {

	public static void main(String[] args) {
		Component c = new Window();
		Decorator d1 = new ScrollBarDecorator(c);
		Decorator d2 = new BlackBorderDecorator(d1);
		d2.display();
	}
}
