package threadsynchronized;

public class Calc {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {
		System.out.println("> " + Thread.currentThread().getName() + ":" + this.memory);
		
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2second
		}
		catch(InterruptedException e) {
		}
		
		System.out.println("< " + Thread.currentThread().getName() + ":" + this.memory);
	}
	
}
