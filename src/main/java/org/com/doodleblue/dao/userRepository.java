package org.com.doodleblue.dao;

import org.com.doodleblue.model.user;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<user, Integer> {
	

}
