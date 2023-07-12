package curriculum_A;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sushi {

	private String taste;
	public static final String CUISINE = "和食";

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}

	public String getCurrentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = Calendar.getInstance().getTime();
		return sdf.format(date);
	}
}
