package com.sample1.dao.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample1.dao.SampleRepository;
import com.sample1.model.User;

@Repository
public interface SampleUserRepositoryImpl extends SampleRepository<User, Long> {

	@Query("select u from User u where u.id = ?1")
	public User getWhereIdIs(@Param(value = "id") Long id);

	//auto generated querry
	public User findByLnameAndFname(String lname, String fname);

	@Query("select u from User u")
	public Page<User> findUsersById(Pageable pageable);

	
	@Query("select u from Users where u.phones[0].getNumber = ?")
	public User getUserWhosPhoneNumber(@Param(value = "num") long num);
	
	
	/*######### ATTENTION ######### 
	 * return repo.findAll(request);
	 * will not be found here , this function is "implemented" inside of the jpa repository 
	 * so stop looking for it here ! 
		
	 * 
	 * 
	 * 
	 * */
	
}
