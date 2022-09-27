package synchronisation.waits;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Before wait");
		
		Thread.sleep(4000);
		
		System.out.println("After wait");

	}

}
