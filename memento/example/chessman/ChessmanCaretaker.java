package zjj.dp.memento.example.chessman;

import java.util.ArrayList;
import java.util.List;
/*
 * author: zjj
 * date: 2015/6/7
 * func:棋子类管理员，负责保存每个时刻棋子备忘录的集合
 */
public class ChessmanCaretaker {
	List<MementoChessman> mementos = new ArrayList<MementoChessman>();
	
	public void add(MementoChessman mementoChessman) {
		mementos.add(mementoChessman);
	}
	
	public MementoChessman get(int i) {
		return mementos.get(i);
	}
}
