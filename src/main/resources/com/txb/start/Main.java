package com.txb.start;
/**
 * ³ÌĞòÈë¿Ú
 * @author 13125
 *
 */

import com.txb.dao.StudentDao;

public class Main {

	public static void main(String[] args) {
			StudentDao student = new StudentDao(null, null, 0, null, null, null, false, null);
			student.setStu_id("0121610880515");
			student.setStu_name("taoxiaobo");
			student.setStu_grade(1);
			student.setStu_natural_id("20160105");
			student.setStu_combinnation_id("2016010101");
			student.setStu_class("123");
			student.setStu_gendar(true);
			student.setStu_tele("13125110952");
			
			Sysout.out.println("hello maven");
	}

}
