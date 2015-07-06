package zjj.dp.responsibilitychain.example;

public class PresidentHandler extends AbstractHandler {

	@Override
	public void handle(PurchaseRequest request) {
		double amount = request.getAmount();
		if(amount>=50000){
			System.out.println("President has handled the request:"+amount + "  purpose:"+request.getPurpose());
		}else{
			this.successor.handle(request);
		}
	}

}
