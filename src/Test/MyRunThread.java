package Test;

import java.util.Random;

public class MyRunThread implements Runnable {
	String name;
	
	public MyRunThread(String n) {
		name=n;
	}
	@Override
	public void run() {
		for (int i=0; i<5; i++){
			System.out.println(i+" "+name);
			try{
				Thread.sleep((long)(Math.random()*1000));
			}
			catch(InterruptedException e){}
		}

	}

}
