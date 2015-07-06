package zjj.dp.strategy.example.moviediscount;

public class MovieTicket {
	private IDiscount discount;
	private double price;
	
	public IDiscount getDiscount() {
		return discount;
	}
	
	public void setDiscount(IDiscount discount) {
		this.discount = discount;
	}
	
	public double getPrice() {
		return discount.calculate(price);
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
