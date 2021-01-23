package com.task.StudentProject1.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "STUDENT")
public class Student {
	
			
				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				@GenericGenerator(name = "native",strategy = "native")
				@JsonProperty("STUDENT_NO")
				@Column(name = "STUDENT_NO")
				private Long studentno;
				
				@JsonProperty("STUDENT_NAME")
				@Column(name = "STUDENT_NAME")
				private String studentname;
				
				@JsonProperty("STUDENT_DOB")
				@Column(name = "STUDENT_DOB")
				private Date studentdob;

				@JsonProperty("STUDENT_DOJ")
				@Column(name = "STUDENT_DOJ")
				private Date studentdoj;

				public Student() {
					super();
					// TODO Auto-generated constructor stub
				}

				public Student(Long studentno, String studentname, Date studentdob, Date studentdoj) {
					super();
					this.studentno = studentno;
					this.studentname = studentname;
					this.studentdob = studentdob;
					this.studentdoj = studentdoj;
				}

				public Long getStudentno() {
					return studentno;
				}

				public void setStudentno(Long studentno) {
					this.studentno = studentno;
				}

				public String getStudentname() {
					return studentname;
				}

				public void setStudentname(String studentname) {
					this.studentname = studentname;
				}

				public Date getStudentdob() {
					return studentdob;
				}

				public void setStudentdob(Date studentdob) {
					this.studentdob = studentdob;
				}

				public Date getStudentdoj() {
					return studentdoj;
				}

				public void setStudentdoj(Date studentdoj) {
					this.studentdoj = studentdoj;
				}

				@Override
				public String toString() {
					return "Student [studentno=" + studentno + ", studentname=" + studentname + ", studentdob="
							+ studentdob + ", studentdoj=" + studentdoj + "]";
				}

				
				
}
