package behavioral.templatemethod;

public class DataProcessorTemplateTest {
	public static void main(String[] args) {
		DataProcessorTemplate template1 = new DataProcessorForCSV();
		DataProcessorTemplate template2 = new DataProcessorForXML();
		
		template1.dataProcess();
		System.out.println();
		template2.dataProcess();
	}
}
