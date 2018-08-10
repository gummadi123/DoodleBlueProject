package org.com.doodleblue.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.com.doodleblue.dao.userRepository;
import org.com.doodleblue.model.user;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class userService {
	
	private final userRepository userrepo;

	public userService(userRepository userrepo) {
		
		this.userrepo = userrepo;
	}
	
	public List<user> findAll()
	{
		
		List<user> usrs= new ArrayList<>();
		
		for(user usr : userrepo.findAll())
		{
			usrs.add(usr);
		}
		
		return usrs;
	}
	
	public void saveUser(user usr )
	{
		userrepo.save(usr);
		
	}
	
	public String findone(int id)
	{
		return userrepo.findById(id).toString();
		
	}
	
	public void delete(int id)
	{
		userrepo.deleteById( id );
		
	}
	
}
