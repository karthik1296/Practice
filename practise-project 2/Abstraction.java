package Assisted;

abstract class Bike
{
	abstract void run();
}

class KTM extends Bike{

	@Override
	void run() {
		System.out.println("KTM is one of the fastest bike");
		
	}
	
}
class PULSAR extends Bike{

	@Override
	void run() {
		System.out.println("PULSAR is one of the stylish bike");
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		Bike b1 = new KTM();
		b1.run();
		
		Bike b2 = new PULSAR();
		b2.run();
		

	}

}