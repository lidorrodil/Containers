package Test;

import javax.management.timer.Timer;

public class Main {

	   public static void main(String args[]) {
		   Ping ping=new Ping();
		   Pong pong=new Pong();
			Timer t1 = new Timer();
		
			MyRunThread d = new MyRunThread("ss");
			d.run();
			
	   } 
	}