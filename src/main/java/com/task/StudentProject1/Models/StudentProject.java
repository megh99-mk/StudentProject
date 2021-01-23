package com.task.StudentProject1.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="STUDENTPROJECT")
public class StudentProject {

	
		

			
			@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
			@GenericGenerator(name = "native",strategy = "native")
			
			@Id
			@ManyToOne(fetch = FetchType.LAZY, optional = false)
		    @JoinColumn(name="STUDENT_NO",referencedColumnName = "STUDENT_NO",nullable = false)
			private Student studentno;
//			
			@Id
			@ManyToOne(fetch = FetchType.LAZY, optional = false)
		    @JoinColumn(name="PRJ_NO",referencedColumnName = "PRJ_NO",nullable = false)
			private Project prjno;
			
			@Column(name="DESIGNATION")
			@JsonProperty("DESIGNATION")
			private String designation;

			public StudentProject() {
				super();
				// TODO Auto-generated constructor stub
			}

			public StudentProject(Student studentno, Project prjno, String designation) {
				super();
				this.studentno = studentno;
				this.prjno = prjno;
				this.designation = designation;
			}

			public Student getStudentno() {
				return studentno;
			}

			public void setStudentno(Student studentno) {
				this.studentno = studentno;
			}

			public Project getPrjno() {
				return prjno;
			}

			public void setPrjno(Project prjno) {
				this.prjno = prjno;
			}

			public String getDesignation() {
				return designation;
			}

			public void setDesignation(String designation) {
				this.designation = designation;
			}

			@Override
			public String toString() {
				return "StudentProject [studentno=" + studentno + ", prjno=" + prjno + ", designation=" + designation
						+ "]";
			}

			
	
	
	
	
}
