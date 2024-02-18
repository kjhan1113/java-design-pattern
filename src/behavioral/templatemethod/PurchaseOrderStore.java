package behavioral.templatemethod;

public class PurchaseOrderStore extends PurchaseOrderTemplate{

	@Override
	public void doSelect() {
		System.out.println("Selection from StorePurchaseOrder Class...");
	}

	@Override
	public void doPayment() {
		System.out.println("Payment from StorePurchaseOrder Class...");		
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivery from StorePurchaseOrder Class...");
	}
}
