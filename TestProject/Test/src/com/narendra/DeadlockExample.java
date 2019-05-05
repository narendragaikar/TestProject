package com.narendra;

/**
 * 
 * @author KETAN
 *
 */
public class DeadlockExample {
	public static void main(String[] args) {
		DeadlockExample deadlockExample=new DeadlockExample();
		
		final A a=deadlockExample.new A();
		final B b=deadlockExample.new B();
		
		Runnable block1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (a) {
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}

					synchronized (b) {
						System.out.println("inside block1");
					}
				}
			}
		};
		
		
		Runnable block2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (b) {
					synchronized (a) {
						System.out.println("inside block2");
					}
				}
				
			}
		};
		
		new Thread(block1).start();
		new Thread(block2).start();
	}
	
	private class A{
		int i=10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
	}
	private class B{
		int i=10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
	}
	
}
