package com.example.beans;

public class Jokes {
	
	private Integer Id;
	private String value;
	private String url;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Jokes(Integer id, String value, String url) {
		super();
		Id = id;
		this.value = value;
		this.url = url;
	}
	
	

}
