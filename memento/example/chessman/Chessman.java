package zjj.dp.memento.example.chessman;
/*
 * author: zjj
 * date: 2015/6/7
 * func:棋子类实例，包含自身属性，保存和重置状态的方法
 */
public class Chessman {
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

	public Chessman(String label, int x, int y) {
		super();
		this.label = label;
		this.X = x;
		this.Y = y;
	}
	
	public MementoChessman save() {
		return new MementoChessman(this);
	}
		
	public void restore(MementoChessman mementoChessman) {
		this.label = mementoChessman.getLabel();
		this.X = mementoChessman.getX();
		this.Y = mementoChessman.getY();
	}
	
	
}
