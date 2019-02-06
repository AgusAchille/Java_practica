package h_threads_2_basics;

public class Main {

	public static void main(String[] args) {
		Thread thread_1 = new Thread (new Counting());
		
		thread_1.start();
		
		System.out.println("Ya ejecuté todo");
		
			
	}
}

class Counting implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}	
}