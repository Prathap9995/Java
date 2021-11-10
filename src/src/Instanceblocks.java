
public class Instanceblocks {
	
	int Eid;
	{ Eid = 102;} //Initialize the variable using Instance block

	public Instanceblocks() {
		this(10,5);
	
		System.out.println("prathap");
		
		// Constructor part
	}
	Instanceblocks(int a){
		System.out.println("1- arg");
	}
	Instanceblocks(int a, int b){
		System.out.println("2- arg");}
	{
		System.out.println("Instance blocks");    //Common for all object
		//Instance blocks
	}
	{  //Possible to declare multiple instance blocks
		System.out.println("Instance blocks -1");
		}
void disp() {
	System.out.println("Id is:" +Eid);
}
	public static void main(String[] args) {
		new Instanceblocks();
		new Instanceblocks(5);
		new Instanceblocks(5,10);
		Instanceblocks m = new Instanceblocks();
		m.disp();
		new Instanceblocks().disp();   // Same as above

	}

}












//Here instance blocks will always executes first
//Constructor logics are specific for object but Instance blocks logics are common for all object