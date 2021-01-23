package com.task.StudentProject1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.StudentProject1.Models.Project;
import com.task.StudentProject1.Models.StudentProject;

@Repository
public interface StudentProjectRepository1 extends JpaRepository<StudentProject, Long>{

	//List<StudentProject>findByprojectno(Long projectno);

	//Optional<StudentProject> findByprojectno(List<StudentProject> studentprojects);

	List<StudentProject> findByprjno(Long prjno);
	void deleteByprjno(Long prjno);
	Optional<StudentProject> findByprjno(List<StudentProject> studentprojects);
	Optional<StudentProject> findByprjno(Project prjno);

}
