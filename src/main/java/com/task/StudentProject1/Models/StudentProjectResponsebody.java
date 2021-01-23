package com.task.StudentProject1.Models;

public class StudentProjectResponsebody
{
	private String message;
	 private String success;
	 private Integer statusCode ;
	 
	public StudentProjectResponsebody(String message, String success, Integer statusCode) {
		super();
		this.message = message;
		this.success = success;
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	 
	
	
	
}
