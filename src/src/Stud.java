
public class Stud {
	String Sname = "Prathap";
	 static String InSname = "SRSMNG";
	public static void main(String[] atgs) {
		Stud s = new Stud();
		System.out.println(s.Sname);
		System.out.println(Stud.InSname);
		s.Sname = "Shwetha";
		System.out.println(s.Sname);
		System.out.println(Stud.InSname);
		Stud s1 = new Stud();
		System.out.println(s1.Sname);
		System.out.println(s1.InSname);
	}

}
