package com.raystec.Threads;

public class HelloWithoutThread {

 String name =null;
 
 public HelloWithoutThread(String threadName) {
	name = threadName;
}

 void run() {
for (int i = 0; i <50; i++) {
	System.out.println(i+"Hello Thread" + name);
}

}
}
