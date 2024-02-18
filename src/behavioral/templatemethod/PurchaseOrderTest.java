package behavioral.templatemethod;

public class PurchaseOrderTest {
	public static void main(String[] args) {
		PurchaseOrderTemplate online = new PurchaseOrderOnline();
		PurchaseOrderTemplate offline = new PurchaseOrderStore();
		
		online.orderProcess();
		offline.orderProcess();
	}
}
