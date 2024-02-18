package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonPattern implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6004065702514517130L;

	private static SingletonPattern instance = new SingletonPattern();

	// To prevent creating instance with new keyword,
	// use private modifier and throw Exception
	private SingletonPattern() {
		System.out.println("Singleton Class is initializing...");
		if (instance != null) {
			throw new RuntimeException("Can't create instance. Please use getInstance()");
		}
	}

	public static SingletonPattern getInstance() {
		return instance;
	}

	// To prevent misuse singleton pattern with clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		if (instance != null) {
			throw new CloneNotSupportedException("Can't create instance. Please use getInstance()");
		}
		return super.clone();
	}
	
	// To prevent misuse singleton pattern with streaming IO
	private Object readResolve() {
		System.out.println("Applying read resolve...");
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonPattern s1 = SingletonPattern.getInstance();
		SingletonPattern s2 = SingletonPattern.getInstance();

		/*
		 * this is not allowed in Singleton Pattern SingletonR exception = new
		 * SingletonR();
		 */
		System.out.println("s1" + s1 + " : " + s1.hashCode());
		System.out.println("s2" + s2 + " : " + s2.hashCode());

		/*
		 * Reflection is not allowed try { Class<?> clazz =
		 * Class.forName("creational.singleton.SingletonR"); Constructor<?> constructorR
		 * = clazz.getDeclaredConstructor(); constructorR.setAccessible(true);
		 * SingletonPattern s3 = (SingletonPattern) constructorR.newInstance();
		 * System.out.println("s3" + s3 + " : " + s3.hashCode()); } catch (Exception e)
		 * { e.printStackTrace(); }
		 */

		/*
		 * Clone is not allowed try { SingletonPattern clonedInstance =
		 * (SingletonPattern) s2.clone(); System.out.println("clonedInstance " + clonedInstance +
		 * " : " + clonedInstance.hashCode()); } catch (CloneNotSupportedException e) {
		 * e.printStackTrace(); }
		 */
		
		// Maintaining a singleton for Stream IO by implementing readResolve()
		try (ObjectOutputStream objOS = new ObjectOutputStream(new FileOutputStream("s2instance.ser"))) {
			objOS.writeObject(s2);

			try (ObjectInputStream objIS = new ObjectInputStream(new FileInputStream("s2instance.ser"))) {
				SingletonPattern streamInstance = (SingletonPattern) objIS.readObject();
				System.out.println("streamInstance " + streamInstance + " : " + streamInstance.hashCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
