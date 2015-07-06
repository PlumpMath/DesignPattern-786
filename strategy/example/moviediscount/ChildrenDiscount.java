package zjj.dp.strategy.example.moviediscount;

public class ChildrenDiscount implements IDiscount {

	@Override
	public double calculate(double price) {
		System.out.println("Children ticket:");
		return price-10;
	}

}
