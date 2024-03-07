package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel = "Iphone";
	    float mobileWeight = 100.25f;
	    System.out.println("My Mobile Is :" + mobileModel + " The Weight Is:" +  mobileWeight );
	    
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 80000;
		System.out.println("Charging complete? " + isFullCharged + " The cost is: " + mobileCost);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile object = new Mobile();
		object.makeCall();
		object.sendMsg();
		System.out.println("This is my mobile");
		

	}

}



