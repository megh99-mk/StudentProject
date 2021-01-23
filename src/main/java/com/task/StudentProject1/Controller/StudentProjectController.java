package com.task.StudentProject1.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.StudentProject1.Models.StudentProject;
import com.task.StudentProject1.Models.StudentProjectResponsebody;
import com.task.StudentProject1.Repository.StudentProjectRepository;
import com.task.StudentProject1.Repository.StudentProjectRepository1;


@RestController
public class StudentProjectController {
	
		
		
		@Autowired 
		private StudentProjectRepository studentprojectRepository;
		private StudentProjectRepository1 studentprojectrepository1;
		private static final Logger logger = LoggerFactory.getLogger(StudentProjectController.class);
		List<StudentProject> studentprojects = new ArrayList();
		
		// get Request**************************************************
		@GetMapping("/StudentProject/student_no")
		public <T> T getStudentProjectByStudentNo(@QueryParam(value = "studentproject")
		long studentproject) 
		{
			Optional <StudentProject> studentproject1= null;
			try 
			{
				studentproject1 = studentprojectRepository.findBystudentno(studentprojects);
				if(studentproject1.get()==null)
				{
					logger.error("No Student for the particular student no");
					return (T) new StudentProjectResponsebody("No Student for the particular student no",
							"false", 404);
				}
				else
					logger.info("Student  is" + studentproject1);
				return (T) studentproject1;
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				logger.error("No  Student for the particular student no");
				return (T) new StudentProjectResponsebody("No Student for the particular student no", "false",
						404);
			
			}			
		}
		
		@GetMapping("/StudentProject/project_no")
		public <T> T getStudentProjectByProjectNo(@QueryParam(value = "studentproject")
		long studentproject) 
		{
			Optional<StudentProject> studentproject1= null;
			try 
			{
				studentproject1 = studentprojectrepository1.findByprjno(studentprojects);
				if(studentproject1.get()==null)
				{
					logger.error("No Student for the particular project no");
					return (T) new StudentProjectResponsebody("No Student for the particular project no",
							"false", 404);
				}
				else
					logger.info("Student  is" + studentproject1);
				return (T) studentproject1;
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				logger.error("No  Student for the particular project no");
				return (T) new StudentProjectResponsebody("No Student for the particular project no", "false",
						404);
			
			}			
		}
		
		////////////////delete method////////////////////

@CrossOrigin
@DeleteMapping("/studentproject/student_no")
public StudentProjectResponsebody deleteStudentByStudentNo(
@PathVariable(value = "studentproject") long studentproject)

{
try {

           if ((studentprojectRepository.findBystudentno(studentproject)) == null) {
              logger.error("student project doesnot exist for the student no ");
                return new StudentProjectResponsebody("student project doesnot exist for the student no", "false",
                  404);
                } else {
                studentprojectRepository.deleteBystudentno(studentproject);
              logger.info("Deleted the student project");
                return new StudentProjectResponsebody("Deleted the student project", "true", 200);
                    }
          } catch (Exception e) {
                     e.printStackTrace();
                logger.error("Exception while deleting the student project");
                   return new StudentProjectResponsebody("Exception while deleting the student project", "false", 500);

              }
}
              ////////////post method///////////////////

         @CrossOrigin
		@PostMapping(path = "StudentProject/student_project", consumes = "application/json")
		@ResponseBody
		public StudentProjectResponsebody addStudentProject(@RequestBody StudentProject studentproject)
		
		{
			try
			{ 
				studentprojectRepository.save(studentproject);
				logger.info("Added New Student");
				return new StudentProjectResponsebody("Added New Student", "true", 200);
				
			}
			catch (Exception e) 
			{
				logger.error("Exception while adding New student");
				e.printStackTrace();

				return new StudentProjectResponsebody("Exception while adding New student", "false", 500);			}
     		}


	 
	       /////////////put method/////////////                            
	 
@CrossOrigin
@PutMapping(path = "/StudentProject/student_project", consumes = "application/json")
public StudentProjectResponsebody updateStudentProject(
		@RequestBody StudentProject studentproject) {
	try {
		Optional<StudentProject> studentproject1= studentprojectRepository
				.findBystudentno(studentproject.getStudentno());
		Optional<StudentProject> studentproject2=studentprojectrepository1
				.findByprjno(studentproject.getPrjno());
		if (studentproject.getDesignation().isEmpty()) {
			studentproject.setDesignation(studentproject1.get().getDesignation());
		}
		studentprojectRepository.save(studentproject);
		logger.info("Updated the  student project");
		return new StudentProjectResponsebody("updated the studnet project", "true", 200);
	} catch (Exception e) {
		logger.error("exception while updating the student project");
		e.printStackTrace();
		return new StudentProjectResponsebody("exception while updating the student project", "false", 500);
	}
}          
		
		
		
		
		
}
