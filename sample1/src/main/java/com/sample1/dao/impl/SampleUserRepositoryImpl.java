package com.sample1.dao.impl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample1.dao.SampleRepository;
import com.sample1.model.User;

@Repository
public interface SampleUserRepositoryImpl extends SampleRepository<User, Long> {

	@Query("select u from User u where u.id = ?1")
	public User getWhereIdIs(@Param(value = "id") Long id);

	public User findByLnameAndFname(String lname, String fname);

}
