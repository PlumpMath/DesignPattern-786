package zjj.dp.responsibilitychain.example;

public class VicePresidentHandler extends AbstractHandler {

	@Override
	public void handle(PurchaseRequest request) {
		double amount = request.getAmount();
		if(amount>=10000&&amount<50000){
			System.out.println("VicePresident has handled the request:"+amount + "   purpose:"+request.getPurpose());
		}else{
			this.successor.handle(request);
		}
	}

}
