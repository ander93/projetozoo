package examples;

import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		
		Vector<Number> v = new Vector<>(3, 2);
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 100000; i++) {
					
					v.addElement(new Integer(i));
					System.out.println("adicionado por t1" );
				}
			}
		});
	
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 100000; i++) {
					//thread-safe
					v.addElement(new Integer(i));
					System.out.println("adicionado por t2" );
				}
			}
		});
	
	
	t1.start();
	t2.start();
	
	
	
	}
	
	

}
