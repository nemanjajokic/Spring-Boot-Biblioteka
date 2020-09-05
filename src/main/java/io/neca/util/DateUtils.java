package io.neca.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	// today's date
	public static Date today() {
		return new Date();
	}
	
	// today's date as dd-MM-yyyy format
	public static String todayStr() {
		return sdf.format(today());
	}
	
	// formatted String date for the passed java.util.Date object
	public static String formatedDate(Date date) {
		return date != null ? sdf.format(date) : todayStr();
	}
	
}
