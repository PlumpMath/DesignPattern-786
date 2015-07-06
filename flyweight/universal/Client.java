package zjj.dp.flyweight.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ≤‚ ‘œÌ‘™ƒ£ Ω
 */
public class Client {

	public static void main(String[] args) {
		FlyWeightFactory fwf = FlyWeightFactory.getIntance();
		FlyWeight fw = fwf.getFlyWeight("A");
		fw.operation("ex A");
		FlyWeight fwb = fwf.getFlyWeight("B");
		fwb.operation("ex B");
	}
}
