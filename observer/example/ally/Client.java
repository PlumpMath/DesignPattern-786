package zjj.dp.observer.example.ally;

/*
 * author: zjj
 * date: 2015/7/4
 * func:观察者模式实例，战队消息通知
 */
public class Client {
		
	public static void main(String[] args) {
		Subject allyCenter = new AllyCenter("Fruit Ally");
		IObserver orange = new Player("orange");
		IObserver apple = new Player("apple");
		IObserver banana = new Player("banana");
		
		allyCenter.joinPlayer(orange);
		allyCenter.joinPlayer(apple);
		allyCenter.joinPlayer(banana);
		
		orange.beAttacked(allyCenter);
	}
	
}
