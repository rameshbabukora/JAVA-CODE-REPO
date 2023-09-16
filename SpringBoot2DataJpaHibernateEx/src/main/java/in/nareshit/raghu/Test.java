package in.nareshit.raghu;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date dte = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm:ss a zzz");
		String s = sdf.format(dte);
		System.out.println(s);
	}
	
	public static void main1(String[] args) {
		Date dte = new Date();
		System.out.println(dte);
		// Mon Sep 06 09:15:14 IST 2021
		
		java.sql.Date d1 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(d1);
		// 2021-09-06
		
		Time t1 = new Time(System.currentTimeMillis());
		System.out.println(t1);
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
	}
}
