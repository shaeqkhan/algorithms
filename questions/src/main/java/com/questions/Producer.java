package com.questions;

import java.util.Vector;

public class Producer implements Runnable {

	private final Vector sharedQueue;
	private final int SIZE;
	
	public Producer(Vector sharedQueue, int SIZE) {
		this.sharedQueue = sharedQueue;
		this.SIZE = SIZE;
	}
	
	public void run() {
		
		for(int i = 0; i < 7; i++) {
			System.out.println("Produced: " + i);
			try{
				produce(i);
			} catch(InterruptedException ex) {
				System.out.println("PRODUCER: " + ex);
			}
		}
		
	}
	
	private void produce(int i) throws InterruptedException {
		
		while(sharedQueue.size() == SIZE) {
			synchronized(sharedQueue) {
				System.out.println("QUEUE IS FULL " + Thread.currentThread().getName()
						+ " is waiting, SIZE: " + sharedQueue.size());
				sharedQueue.wait();
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
		
	}

	
	
}
