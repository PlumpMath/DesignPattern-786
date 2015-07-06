package zjj.dp.strategy.example.moviediscount;

public class VipDiscount implements IDiscount {

	@Override
	public double calculate(double price) {
		System.out.println("Vip ticket:");
		System.out.println("get award!");
		return 0.5*price;
	}

}
