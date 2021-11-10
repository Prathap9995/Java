
public class Switch {
	int a = 10;
	final int b=20;
	public static void main(String[] args) {
		Switch T = new Switch();
		
		switch(T.a) {
		case 1+9: System.out.println("Prathap");
		break;
		case 20: System.out.println("barkur");
		break;
		default : System.out.println("Default");
		break;}
	}}


//Used to declare multiple options
//breaks are optional..it will execute uupto next break statement or till end of the statement.
//both case and default is optional
//inside the switch we can't declare independent sop's.
//we can declare default case anywhere
//case label must be unique
//we can't declare variable name as case label
//The case label value must be within range of argument value.
//Unique code convention is applicable


/* Advanced :--------
final int a = 10;
Switch(a)
{
case a : SOP("");                             ------> Using variable name as case label
break;
}

*/

/*
 Unique code convention :-----
 
 char ch = 'd';
 switch(a)
 {
 case a : SOP()
 break;
 }
 */
