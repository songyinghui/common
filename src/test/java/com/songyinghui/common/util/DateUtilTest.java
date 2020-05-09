package com.songyinghui.common.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(dateByInitMonth);
		System.out.println(format);
	}

	@Test
	public void testGetDateByFullMonth() {
		Date dateByFullMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(dateByFullMonth);
		System.out.println(format);
	}
	@Test
	public void pinjie() {
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		Date dateByFullMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(dateByInitMonth);
		String format2 = simpleDateFormat.format(dateByFullMonth);
		String sql = "select * from t_order where create_time>='"+format+"' and create_time<='"+format2+"' ";
		System.out.println(sql);
	}

}
