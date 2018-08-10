package org.com.doodleblue.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int mobilenumber;
	
	private int age;
	
	private String emailid;
	
	private String address;
	
	private String gender;
	
	private String image;
	
	public user() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age + ", emailid="
				+ emailid + ", address=" + address + ", gender=" + gender + ", image=" + image + "]";
	}

	public user(String name, int mobilenumber, int age, String emailid, String address, String gender, String image) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.emailid = emailid;
		this.address = address;
		this.gender = gender;
		this.image = image;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
