package com.task.StudentProject1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.StudentProject1.Models.Project;
import com.task.StudentProject1.Models.Student;
import com.task.StudentProject1.Models.StudentProject;


@Repository
public interface StudentProjectRepository extends JpaRepository<StudentProject,Long> {
	
//void deleteByEmployerContractId(Long Employer_ContractId);

     
      
        List<StudentProject>findBystudentno(Long studentno);
		void deleteBystudentno(long studentproject);
//		List<StudentProject> findByprojectno(long studentproject);
		Optional<StudentProject> findBystudentno(List<StudentProject> studentprojects);
	     //Optional<StudentProject> findByprojectno(List<StudentProject> studentprojects);
		Optional<StudentProject> findBystudentno(Student studentno);
		
   // List<StudentProject>findByprojectno(Long projectno);
	}

