package com.treeset;

public class Student implements Comparable<Student> {
	int number;
	String Name;
	String Address;

	
	public Student(int number, String name, String address) {
		super();
		this.number = number;
		Name = name;
		Address = address;
	}
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public String getAddress() {
//		return Address;
//	}
//	public void setAddress(String address) {
//		Address = address;
//	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", Name=" + Name + ", Address=" + Address + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		
//		if(this.number<o.number) {
//			return 1;
//		}
//		else if (this.number>o.number) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
@Override
public int compareTo(Student o) {
	
	return this.Name .compareTo(o.Name);
}
	
	
	

}
