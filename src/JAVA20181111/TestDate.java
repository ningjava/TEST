package JAVA20181111;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		System.out.println("------------part1----------");
		Date date = new Date();   //当前日期
		date = new Date(2018-1900,4-1,28);  //指定日期2018年4月28日
		System.out.println(date.toString());
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a = s.format(date);
		System.out.println(a);
		System.out.println("------------part2----------");
		date = new Date(System.currentTimeMillis());
		System.out.println(date.toString());
		System.out.println(s.format(date));
		System.out.println("------------part3----------");
		System.out.println(date.getDate());
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
	}

}
