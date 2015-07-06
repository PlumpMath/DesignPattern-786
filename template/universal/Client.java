package zjj.dp.template.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ²âÊÔÄ£°åÄ£Ê½
 */
public class Client {

	public static void main(String[] args) {
		SubModel1 model1 = new SubModel1();
		SubModel2 model2 = new SubModel2();
		
		model1.setMethod1Flag(false);
		model1.common_method();
		model2.common_method();
	}

}
