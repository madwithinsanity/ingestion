package com.madwithinsanity.entities;

public class JobEntity {
	boolean isQueued = false;
	String id, message;
	
	public boolean isQueued() {
		return isQueued;
	}
	
	public void setQueued(boolean isQueued) {
		this.isQueued = isQueued;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
