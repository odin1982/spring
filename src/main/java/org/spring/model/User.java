package org.spring.model;

import java.util.LinkedList;

public class User {
	private Long id;
	private String firstName;
	private Integer age;
	private LinkedList<Post> posts = new LinkedList<Post>();
	
	public LinkedList<Post> getPosts() {
		return posts;
	}
	public void setPosts(LinkedList<Post> posts) {
		this.posts = posts;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}


	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", age=" + age + ", posts=" + posts + "]";
	}
	
	
}
