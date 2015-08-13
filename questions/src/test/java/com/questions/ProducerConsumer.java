package com.questions;

import java.util.Vector;

public class ProducerConsumer {

	public static void main(String[] args) {

		Vector sharedQueue = new Vector();
		int size = 4;
		
		Thread producerThread = new Thread(new Producer(sharedQueue, size), "Producer");
		Thread consumerThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
		
		producerThread.start();
		consumerThread.start();

	}

}
