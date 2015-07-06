package zjj.dp.memento.example.chessman;

/*
 * author: zjj
 * date: 2015/6/7
 * func:备忘录模式实例，带悔棋和撤销功能的象棋
 */
public class Client {
	private static int index = -1;
	private static ChessmanCaretaker caretaker = new ChessmanCaretaker();
	
	public static void main(String[] args) {
		Chessman chessman = new Chessman("车",1,4);
		play(chessman);
		chessman.setX(3);
		play(chessman);
		chessman.setY(5);
		play(chessman);
		undo(chessman);
		undo(chessman);
		redo(chessman);
		redo(chessman);
	}
	
	public static void undo(Chessman chessman) {
		System.out.println("-------悔棋---------");
		index--;
		chessman.restore(caretaker.get(index));
		System.out.println("棋子"+chessman.getLabel()+"位置为：("+chessman.getX()+","+chessman.getY()+")");
	}
	
	public static void redo(Chessman chessman) {
		System.out.println("-------撤销悔棋---------");
		index++;
		chessman.restore(caretaker.get(index));
		System.out.println("棋子"+chessman.getLabel()+"位置为：("+chessman.getX()+","+chessman.getY()+")");
	}
	
	public static void play(Chessman chessman) {
		caretaker.add(chessman.save());
		index++;
		System.out.println("棋子"+chessman.getLabel()+"位置为：("+chessman.getX()+","+chessman.getY()+")");
	}
}
