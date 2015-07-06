package zjj.dp.mediator.example.guidriver;

public class ComboBox implements IComponent {
	private IMediator mediator;
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}
	
	@Override
	public void changed(String text) {
		mediator.componentChanged(this,text);
	}

	@Override
	public void update(String text) {
		System.out.println("ComboBox 增加了一项"+ text);
	}
	
	public void select(String text) {
		System.out.println("ComboBox 选中了"+ text);
		changed(text);
	}
	
	public void change(String text) {
		System.out.println("ComboBox 目标项也变为"+ text);
	}
}
