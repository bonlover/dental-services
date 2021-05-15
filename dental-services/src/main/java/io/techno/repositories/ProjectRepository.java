package io.techno.repositories;

import io.techno.domain.Project;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);

}
