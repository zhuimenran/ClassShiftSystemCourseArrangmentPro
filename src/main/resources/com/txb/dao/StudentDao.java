package com.txb.dao;

/**
 * ѧ����Ϣ������
 * @author 13125
 * @version v1.0
 * @time 2019.3.19
 */
public class StudentDao {
	//ѧ��id
	String stu_id;
	
	//ѧ������
	String stu_name;
	
	//ѧ���꼶
	int stu_grade;
	
	//ѧ����Ȼ�༶id
	String stu_natural_id;
	
	//ѧ����ϰ༶id
	String stu_combinnation_id;
	
	//ѧ��ѡ����Ϣ
	String stu_class;
	
	//ѧ���Ա�
	boolean stu_gendar;
	
	//ѧ����ϵ��ʽ
	String stu_tele;

	/**
	 * ���캯��
	 * @param stu_id
	 * @param stu_name
	 * @param stu_grade
	 * @param stu_natural_id
	 * @param stu_combinnation_id
	 * @param stu_class
	 * @param stu_gendar
	 * @param stu_tele
	 */
	public StudentDao(String stu_id, String stu_name, Integer stu_grade, String stu_natural_id,
			String stu_combinnation_id, String stu_class, boolean stu_gendar, String stu_tele) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_grade = stu_grade;
		this.stu_natural_id = stu_natural_id;
		this.stu_combinnation_id = stu_combinnation_id;
		this.stu_class = stu_class;
		this.stu_gendar = stu_gendar;
		this.stu_tele = stu_tele;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public int getStu_grade() {
		return stu_grade;
	}

	public void setStu_grade(int stu_grade) {
		this.stu_grade = stu_grade;
	}

	public String getStu_natural_id() {
		return stu_natural_id;
	}

	public void setStu_natural_id(String stu_natural_id) {
		this.stu_natural_id = stu_natural_id;
	}

	public String getStu_combinnation_id() {
		return stu_combinnation_id;
	}

	public void setStu_combinnation_id(String stu_combinnation_id) {
		this.stu_combinnation_id = stu_combinnation_id;
	}

	public String getStu_class() {
		return stu_class;
	}

	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}

	public boolean isStu_gendar() {
		return stu_gendar;
	}

	public void setStu_gendar(boolean stu_gendar) {
		this.stu_gendar = stu_gendar;
	}

	public String getStu_tele() {
		return stu_tele;
	}

	public void setStu_tele(String stu_tele) {
		this.stu_tele = stu_tele;
	}
}