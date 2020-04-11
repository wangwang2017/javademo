package com.example.javademo.concurrent.safeend;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：中断使用Runnable启动的线程
 */
public class EndRunnable {
	
	private static class UseRunnable implements Runnable{
		
		@Override
		public void run() {

			String threadName = Thread.currentThread().getName();
			while(!Thread.currentThread().isInterrupted()){

			}
			System.out.println(threadName+" interrput flag is "
					+Thread.currentThread().isInterrupted());
		}			
	}

	public static void main(String[] args) throws InterruptedException {
		UseRunnable useRunnable = new UseRunnable();
		Thread endThread = new Thread(useRunnable,"endThread");
		endThread.start();
		Thread.sleep(20);
		endThread.interrupt();
	}

}
