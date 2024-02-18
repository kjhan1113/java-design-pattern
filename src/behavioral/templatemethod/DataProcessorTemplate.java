package behavioral.templatemethod;

abstract class DataProcessorTemplate {
	// Template method for data processing
	public final void dataProcess() {
		prepareDataHook();
		readData();
		validateData();
		transformData();
		saveData();
		finalizeDataHook();
	}

	// Hook methods with default implementations
	protected void prepareDataHook() {
		System.out.println("Preparing data in super class...");
	}

	protected void finalizeDataHook() {
		System.out.println("Finalizing data in super class...");
	}

	// Abstract methods to be implemented by subclasses
	protected abstract void readData();

	protected abstract void validateData();

	protected abstract void transformData();

	protected abstract void saveData();
}
