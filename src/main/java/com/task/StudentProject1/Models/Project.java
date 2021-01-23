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
@Table(name = "PROJECT")
public class Project {
		

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@GenericGenerator(name = "native",strategy = "native")
			@JsonProperty("PRJ_NO")
			@Column(name = "PRJ_NO")
			private Long prjno;
			
			@JsonProperty("PRJ_NAME")
			@Column(name = "PRJ_NAME")
			private String prjname;
			
			@JsonProperty("PRJ_DUR")
			@Column(name = "PRJ_DUR")
			private Date prjdur;

			@JsonProperty("PRJ_PLATFORM")
			@Column(name = "PRJ_PLATFORM")
			private String prjplatform;

			public Project() {
				super();
				// TODO Auto-generated constructor stub
			}

			public Project(Long prjno, String prjname, Date prjdur, String prjplatform) {
				super();
				this.prjno = prjno;
				this.prjname = prjname;
				this.prjdur = prjdur;
				this.prjplatform = prjplatform;
			}

			public Long getPrjno() {
				return prjno;
			}

			public void setPrjno(Long prjno) {
				this.prjno = prjno;
			}

			public String getPrjname() {
				return prjname;
			}

			public void setPrjname(String prjname) {
				this.prjname = prjname;
			}

			public Date getPrjdur() {
				return prjdur;
			}

			public void setPrjdur(Date prjdur) {
				this.prjdur = prjdur;
			}

			public String getPrjplatform() {
				return prjplatform;
			}

			public void setPrjplatform(String prjplatform) {
				this.prjplatform = prjplatform;
			}

			@Override
			public String toString() {
				return "Project [prjno=" + prjno + ", prjname=" + prjname + ", prjdur=" + prjdur + ", prjplatform="
						+ prjplatform + "]";
			}

		
			
		
			
}
