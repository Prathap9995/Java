
public class childAbstract extends Abstraction {    //Implementing methods by inheritance

	public static void main(String[] args) {
		childAbstract  c = new childAbstract();   //We can call all methods due to inheritance
		c.color();  
		c.engine();
		c.Rules();
//Abstraction a = new Abstraction();  -->We cannot create object for the abstract class
	}

	@Override     //Adding unimplemented methods
	public void color() {
		System.out.println("Child should implement here : color black");
		
	}

}


//We cannot create object for the abstract class ....by inheritance we can achieve it