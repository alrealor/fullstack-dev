package com.fullstack.restfulwebservice.todo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
	
	public List<Todo> findByUserName(String userName);

}
