package abstraction;

abstract class Bike {
	abstract void run();
	public void display(){
		System.out.println("Display");
	}
	
}

class Honda4 extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike obj = new Honda4();
		obj.run();
	}
}