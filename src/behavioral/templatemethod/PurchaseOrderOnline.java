package behavioral.templatemethod;

public class PurchaseOrderOnline extends PurchaseOrderTemplate {

	@Override
	public void doSelect() {
		System.out.println("Selection from OnlinePurchaseOrder Class...");
	}

	@Override
	public void doPayment() {
		System.out.println("Payment from OnlinePurchaseOrder Class...");		
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivery from OnlinePurchaseOrder Class...");
	}

}
