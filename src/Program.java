import java.util.concurrent.Semaphore;

public class Program {

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(4);
		
		System.out.println("Total available Semaphore permits : " 
                + semaphore.availablePermits());
		
//        Atm t1 = new Atm("A", semaphore);
//        t1.start();
//
//        Atm t2 = new Atm("B", semaphore);
//        t2.start();
//
//        Atm t3 = new Atm("C", semaphore);
//        t3.start();
//
//        Atm t4 = new Atm("D", semaphore);
//        t4.start();
//
//        Atm t5 = new Atm("E", semaphore);
//        t5.start();
//
//        Atm t6 = new Atm("F", semaphore);
//        t6.start();
		
		// In stead of creating a variable for each atm, the threads can be started in a loop as shown below.
		for(int i = 1; i <= 6; i++) {
			new Atm("ATM "+ i, semaphore).start();
		}

	}

}
