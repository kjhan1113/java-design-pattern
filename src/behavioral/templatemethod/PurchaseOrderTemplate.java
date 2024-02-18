package behavioral.templatemethod;

public abstract class PurchaseOrderTemplate {
	public abstract void doSelect();
	public abstract void doPayment();
	public final void doPack() {
		System.out.println("Gift wrap done.");
	}
	public abstract void doDelivery();
	public final void orderProcess() {
		doSelect();
		doPayment();
		doPack();
		doDelivery();
	}
}
