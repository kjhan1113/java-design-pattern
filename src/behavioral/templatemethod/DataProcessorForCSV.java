package behavioral.templatemethod;

public class DataProcessorForCSV extends DataProcessorTemplate {
	@Override
	protected void readData() {
		System.out.println("Reading data from CSV file");
	}

	@Override
	protected void validateData() {
		System.out.println("Validating CSV data");
	}

	@Override
	protected void transformData() {
		System.out.println("Transforming CSV data");
	}

	@Override
	protected void saveData() {
		System.out.println("Saving processed CSV data");
	}
	
	// Override the preparing hook for CSV
	@Override
	protected void prepareDataHook() {
		System.out.println("Overriding prepareDataHooks in CSV subclass");
	}
}
