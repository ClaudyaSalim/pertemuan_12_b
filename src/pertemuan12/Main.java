package pertemuan12;

public class Main {
	

	public Main() {
		Class1 countdown1 = new Class1();
		countdown1.start();
		
		Class2 count = new Class2();
		Thread countdown2 = new Thread(count);
		countdown2.start();
		
		System.out.println("Thread 1 name: " + countdown1.getName());
		System.out.println("Thread 2 name: " + countdown2.getName());
		
		countdown1.setPriority(10);
		countdown2.setPriority(1);
		
		System.out.println("Priority Thread 1: " + countdown1.getPriority());
		System.out.println("Priority Thread 2: " + countdown2.getPriority());
		
	}

	public static void main(String[] args) {
		
		new Main();

	}

}
