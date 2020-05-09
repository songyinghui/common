package com.songyinghui.common.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static Date getDateByInitMonth(Date src) {
		Calendar instance = Calendar.getInstance();
		instance.setTime(src);
		instance.set(instance.DAY_OF_MONTH,1);;
		instance.set(instance.HOUR, 0);
		instance.set(instance.MINUTE, 0);
		instance.set(instance.SECOND, 0);
		return instance.getTime();
	}
	
	public static Date getDateByFullMonth(Date src){
		Calendar instance = Calendar.getInstance();
		instance.setTime(src);
		if(instance.get(instance.MONTH)==2) {
			instance.set(instance.DAY_OF_MONTH, 28);
		}else {
			instance.set(instance.DAY_OF_MONTH, 31);
		}
		instance.set(instance.HOUR, 23);
		instance.set(instance.MINUTE, 59);
		instance.set(instance.SECOND, 59);
		return instance.getTime();
		}
	 
}
