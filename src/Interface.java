
public class Interface implements CentralTraffic,ContinentTraffic {    //To implements the interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new Interface();  // We have created a object for interface to implements the methods from centraltraffic
	a.greenGo();
	a.redStop();
	a.flashingYellow();
	
	
	//To call our local method
	
	Interface b = new Interface();
	b.getData();
	b.Treain();
	b.greenGo();
	
	//to call continent traffic interface
	ContinentTraffic c = new Interface();
	c.Treain();
	
	}
	//The methods we have defined in local class
	public void getData() {
		System.out.println("Dummy");
		}
		
	

	@Override
	public void greenGo() {
		System.out.println("green implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("Red implemetation");
		
	}

	@Override
	public void flashingYellow() {
		System.out.println("Flash yellow implements");
		
	}
	@Override
	public void Treain() {  //from continent traffic
		 
		System.out.println("Train implement from continent");
		
	}

}


//Interfaces and class will lies in a same line
//Interfaces will have methods but not body
//Classes should define and implements methods present in interface
//We have to implements all the methods from interfaces
//one class can implements more than one interface