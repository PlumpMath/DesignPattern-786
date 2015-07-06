package zjj.dp.mediator.example.guidriver;

public class Button implements IComponent {
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
		//空
	}
	
	public void add(String text) {
		System.out.println("Button被点击了， 增加了"+ text);
		changed(text);
	}

}
