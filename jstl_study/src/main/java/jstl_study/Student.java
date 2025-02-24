package jstl_study;

public class Student {
	// num, name, phone, addr, age
	
	private String num;
	private String name;
	private String phone;
	private String addr;
	private int age;
	public Student() {
	}
	public Student(String num, String name, String phone, String addr, int age) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.age = age;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", phone=" + phone + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	
	
}
