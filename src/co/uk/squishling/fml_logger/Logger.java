package co.uk.squishling.fml_logger;

import java.util.Calendar;

public class Logger {
	public static void INFO(String s) {
		Calendar cal = Calendar.getInstance();
		
		String class_name = null;
		try {
			class_name = Class.forName(new Exception().getStackTrace()[1].getClassName()).getSimpleName();
		} catch (ClassNotFoundException e) {
			class_name = Logger.class.getSimpleName();
		}
		
		System.out.println("[" + String.format("%02d", cal.get(Calendar.HOUR_OF_DAY)) + ":" +  String.format("%02d", cal.get(Calendar.MINUTE)) + ":" + String.format("%02d", cal.get(Calendar.SECOND)) + "] [" + Thread.currentThread().getName() + "/INFO] [" + class_name + "]: " + s);
	}
	
	public static void WARN(String s) {
		Calendar cal = Calendar.getInstance();
		
		String class_name = null;
		try {
			class_name = Class.forName(new Exception().getStackTrace()[1].getClassName()).getSimpleName();
		} catch (ClassNotFoundException e) {
			class_name = Logger.class.getSimpleName();
		}
		
		System.out.println("[" + String.format("%02d", cal.get(Calendar.HOUR_OF_DAY)) + ":" +  String.format("%02d", cal.get(Calendar.MINUTE)) + ":" + String.format("%02d", cal.get(Calendar.SECOND)) + "] [" + Thread.currentThread().getName() + "/WARN] [" + class_name + "]: " + s);
	}
	
	public static void ERROR(String s) {
		Calendar cal = Calendar.getInstance();
		
		String class_name = null;
		try {
			class_name = Class.forName(new Exception().getStackTrace()[1].getClassName()).getSimpleName();
		} catch (ClassNotFoundException e) {
			class_name = Logger.class.getSimpleName();
		}

		System.out.println("[" + String.format("%02d", cal.get(Calendar.HOUR_OF_DAY)) + ":" +  String.format("%02d", cal.get(Calendar.MINUTE)) + ":" + String.format("%02d", cal.get(Calendar.SECOND)) + "] [" + Thread.currentThread().getName() + "/ERROR] [" + class_name + "]: " + s);
	}
}
