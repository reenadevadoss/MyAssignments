package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Dial a Number to make a call");
		String mobileModel = "samsung Galaxy";
		float mobileWeight = 500f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
		public void sendMsg() {
			System.out.println("Text some characters to send a message");
			boolean fullCharged = true;
			int mobileCost = 10000;
			System.out.println(fullCharged);
			System.out.println(mobileCost);
	}

	public static void main(String[] args) {
		Mobile mc = new Mobile();
		mc.makeCall();
		mc.sendMsg();
		System.out.println("This is my Mobile");
		
	}
}
//Assignment 2