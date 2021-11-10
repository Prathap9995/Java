
public class InstaVsStat {
	int a = 10;    				//instance variable
	static int b = 20;			//Static variable
	public static void main(String[] args) {
		InstaVsStat t = new InstaVsStat();  //creating object
		System.out.println(t.a);			//call by object
		System.out.println(InstaVsStat.b);	//call by class name	
		System.out.println(t.b);			//call by object--> not recomened
		t.a = 100;							//assigning values	
		b = 200;
		System.out.println(t.a);       		//100 output
		System.out.println(t.b);			//200 output
		InstaVsStat t1 = new InstaVsStat();
	//new object creation
		System.out.println(t1.a);			//10 output --> we have separate copy(memory i.e separate 10 value) for every instance variable object creation
		System.out.println(t1.b);			//200 --> Only sigle that is overrriding till the end
		InstaVsStat t2 = new InstaVsStat();
		System.out.println(t2.a);       	//10	
		System.out.println(t2.b);          	//200
	}

}


//Instance vs Static
//