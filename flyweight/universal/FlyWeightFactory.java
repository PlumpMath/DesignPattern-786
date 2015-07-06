package zjj.dp.flyweight.universal;

import java.util.HashMap;
import java.util.Map;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 享元工厂，单例模式实现
 */
public class FlyWeightFactory {
	private static final FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
	private Map<String,FlyWeight> map;
	
	private FlyWeightFactory() {
		map = new HashMap<String,FlyWeight>();
		ConcreteFlyWeightA concreteFlyWeightA = new ConcreteFlyWeightA();
		map.put("A", concreteFlyWeightA);
		ConcreteFlyWeightB concreteFlyWeightB = new ConcreteFlyWeightB();
		map.put("B", concreteFlyWeightB);
	}
	
	public static FlyWeightFactory getIntance() {
		return flyWeightFactory;
	}
	
	public FlyWeight getFlyWeight(String name) {
		if(map.containsKey(name)) {
			return map.get(name);
		}else {
			return null;
		}
	}
}
