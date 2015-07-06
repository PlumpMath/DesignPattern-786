package zjj.dp.strategy.example.moviediscount;

public class StudentDiscount implements IDiscount {

	@Override
	public double calculate(double price) {
		System.out.println("Student ticket:");
		return price*0.8;
	}

}
