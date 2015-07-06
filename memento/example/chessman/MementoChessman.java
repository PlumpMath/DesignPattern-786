package zjj.dp.memento.example.chessman;
/*
 * author: zjj
 * date: 2015/6/7
 * func:棋子类备忘录，保存棋子某时刻的状态
 */
public class MementoChessman {
	private String label;
	private int X;
	private int Y;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public MementoChessman(Chessman chessman) {
		super();
		this.label = chessman.getLabel();
		X = chessman.getX();
		Y = chessman.getY();
	}
}
