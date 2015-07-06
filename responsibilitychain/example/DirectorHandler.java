package zjj.dp.responsibilitychain.example;

public class DirectorHandler extends AbstractHandler {

	@Override
	public void handle(PurchaseRequest request) {
		double amount = request.getAmount();
		if(amount<10000){
			System.out.println("director has handled the request:"+amount + "   purpose:"+request.getPurpose());
		}else{
			this.successor.handle(request);
		}
	}

}
