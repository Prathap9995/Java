import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//To print the date and current time ....first we have to create object date class
		Date d = new Date();
	System.out.println(	d.toString());
//To print in customized format
	SimpleDateFormat newdate = new SimpleDateFormat("M/dd/yyyy");     //Formats were in google
	newdate.format(d);    //We are combining the date here
	System.out.println(newdate.format(d));

	}

}



//Where this is util package
//Where to read the date we have to convert it into string