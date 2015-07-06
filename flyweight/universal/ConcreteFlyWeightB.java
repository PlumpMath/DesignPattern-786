package zjj.dp.flyweight.universal;

public class ConcreteFlyWeightB extends FlyWeight {
	
	public ConcreteFlyWeightB() {
		this.intrinsic = "FlyWeightB";
	}
	
	@Override
	public void operation(String extrinsic) {
		System.out.println("intrinsic:"+this.intrinsic+"  extrinsic:"+extrinsic);
	}

}
