package zjj.dp.mediator.example.guidriver;

public class ConcreteMediator implements IMediator {
	private Button button;
	private ComboBox comboBox;
	private List list;
	
	public ConcreteMediator(Button button,ComboBox comboBox,List list) {
		this.button = button;
		this.comboBox = comboBox;
		this.list = list;
	}
	
	@Override
	public void componentChanged(IComponent c,String text) {
		if(c == button) {
			comboBox.update(text);
			list.update(text);
		}
		else if(c == comboBox) {
			list.change(text);
		}
		else if(c == list) {
			comboBox.change(text);
		}
	}

}
