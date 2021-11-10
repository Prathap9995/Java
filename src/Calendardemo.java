import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendardemo {

	public static void main(String[] args) {
	//Same as date class	
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat newdate = new SimpleDateFormat("M/dd/yyyy");
		newdate.format(cal.getTime());
		System.out.println(newdate.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));    //We rare have lot of method in this feature
	}

}
