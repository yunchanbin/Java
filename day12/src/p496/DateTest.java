package p496;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		// p.538
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("YY/M/d-hh:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);

		// p.542
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YY/M/d-hh:mm:ss");
		sdf2.setTimeZone(tz);
		System.out.println(sdf2.format(new Date()));
		
		Calendar cal = Calendar.getInstance(tz);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		
		System.out.printf("%d %d %d %d %d %d", yy,mm,dd,hh,mi,ss);
	}

}
