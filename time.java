import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class time {
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("GMT");
		SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy EEEE hh:mm:ss a");
		date_format.setTimeZone(timeZone);
		Date date=new Date();		
		String current_date_time=date_format.format(date);		
		System.out.println("GMT-"+current_date_time);
		
		timeZone = TimeZone.getTimeZone("Asia/Kolkata");
		date_format.setTimeZone(timeZone);
		current_date_time=date_format.format(date);		
		System.out.println("Asia/Kolkata-"+current_date_time);
		
		timeZone = TimeZone.getTimeZone("Australia/Perth");
		date_format.setTimeZone(timeZone);
		current_date_time=date_format.format(date);		
		System.out.println("Australia/Perth-"+current_date_time);
		
		timeZone = TimeZone.getTimeZone("Asia/Qatar");
		date_format.setTimeZone(timeZone);
		current_date_time=date_format.format(date);		
		System.out.println("Asia/Qatar-"+current_date_time);
				
		timeZone = TimeZone.getTimeZone("Africa/Johannesburg");
		date_format.setTimeZone(timeZone);
		current_date_time=date_format.format(date);		
		System.out.println("Africa/Johannesburg-"+current_date_time);
	}
}
