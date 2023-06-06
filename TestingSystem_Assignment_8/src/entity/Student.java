package entity;

import java.io.Serializable;

public class Student implements Serializable{
	private final int id;
	private String name;
	private float score;	
	private static int temp=1;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	public Student(String name, float score) {
		this.id=temp;
		this.name = name;
		this.score = score;
		temp++;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	
	public final void hocBai() {
		System.out.println("SV hoc bai");
	}
}