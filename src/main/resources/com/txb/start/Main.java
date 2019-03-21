package com.txb.start;
/**
 * ³ÌĞòÈë¿Ú
 * @author 13125
 *
 */

import com.txb.dao

public class Main {

	public static void main(String[] args) {
			StudentDao student = new StudentDao();
			student.setStu_id("0121610880515");
			student.setStu_name("taoxiaobo");
			student.setStu_Grade(1);
			student.setStu_Natural_id("20160105");
			student.setStu_Combinnation_id("2016010101");
			student.setStu_Class("123");
			student.setStu_Gendar(true);
			student.setStu_Tele("13125110952");
			
			Sysout.out.println("hello maven");
	}

}
