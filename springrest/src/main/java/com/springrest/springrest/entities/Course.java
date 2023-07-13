package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	
	@Id
	private long id;
	private String title;
	private String descrition;

	public Course() {
		super();
	}

	public Course(long id, String title, String descrition) {
		super();
		this.id = id;
		this.title = title;
		this.descrition = descrition;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descrition=" + descrition + "]";
	}

}
