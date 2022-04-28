package functional_Interfaces;

public class Sender {
	//
	public void send(String message) {
	try {
		Thread.sleep(50);
	}catch(Exception e) {
		System.out.println("I pity the Foo, who interrupted YOU \n");
	}
	System.out.println(message + " Sent\n");
	}
}
