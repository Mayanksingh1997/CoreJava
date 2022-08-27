
public class Multithreading {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()->{
			for(int i=1; i<=5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1; i<=5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {}
			}
		});
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Bye");

	}

}
