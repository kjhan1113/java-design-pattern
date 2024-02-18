package behavioral.templatemethod;

public class DataProcessorForXML extends DataProcessorTemplate {
	@Override
	protected void readData() {
		System.out.println("Reading data from XML file");
	}

	@Override
	protected void validateData() {
		System.out.println("Validating XML data");
	}

	@Override
	protected void transformData() {
		System.out.println("Transforming XML data");
	}

	@Override
	protected void saveData() {
		System.out.println("Saving processed XML data");
	}

	// Override the finalizing hook for XML
	@Override
	protected void finalizeDataHook() {
		System.out.println("Overriding finalizeDataHook in XML subclass");
	}
}
