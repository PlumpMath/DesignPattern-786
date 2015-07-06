package zjj.dp.strategy.example.moviediscount;

/*
 * author: zjj
 * date: 2015/7/4
 * func:策略模式实例，电影票不同折扣方案的实现
 */
public class Client {
		
	public static void main(String[] args) {
		IDiscount vipDiscount = new VipDiscount();
		IDiscount childrenDiscount = new ChildrenDiscount();
		MovieTicket ticket = new MovieTicket();
		ticket.setDiscount(childrenDiscount);
		ticket.setPrice(30);
		System.out.println(ticket.getPrice());
	}
	
}
