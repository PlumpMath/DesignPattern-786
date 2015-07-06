package zjj.dp.flyweight.universal;

public class ConcreteFlyWeightA extends FlyWeight {
	
	public ConcreteFlyWeightA() {
		this.intrinsic = "FlyWeightA";
	}
	
	@Override
	public void operation(String extrinsic) {
		System.out.println("intrinsic:"+this.intrinsic+"  extrinsic:"+extrinsic);
	}

}
