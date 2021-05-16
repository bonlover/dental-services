package io.techno.services;

import io.techno.domain.Project;
import io.techno.exceptions.ProjectIdException;
import io.techno.repositories.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
			
		} catch(Exception e) {
			throw new ProjectIdException("Project ID '" +project.getProjectIdentifier().toUpperCase()+"' already exist");
		}
		
	}

}
