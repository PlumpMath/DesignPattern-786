package zjj.dp.builder.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ���Խ�����ģʽ
 */
public class Client {

	public static void main(String[] args) {
		Director director = new Director();	
		director.getProductABySeq1().run();
		director.getProductABySeq2().run();
		director.getProductBBySeq1().run();
		director.getProductBBySeq2().run();
	}

}
