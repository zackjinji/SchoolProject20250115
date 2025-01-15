package com.sa;
/**
 * @version 1.0
 * @author jinji
 * <br>
 * <h3>學員管理系統</h3>
 * 20250115
 */
public class Student {
	/**
	 * @param name 新增學生姓名<br>
	 * Ex<br>
	 * new Student("aa")
	 */
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
/**
 * 
 * @return 讀取姓名
 */
	public String getName() {
		return name;
	}
/**
 * 
 * @param name 修改姓名
 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return修改姓名
	 */
	public String show()
	{
		return "名:"+name;
	}


}
