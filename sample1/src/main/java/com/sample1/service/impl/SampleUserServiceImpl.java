package com.sample1.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample1.dao.impl.SampleUserRepositoryImpl;
import com.sample1.model.User;
import com.sample1.service.SampleUserService;

@Service
@Transactional
public class SampleUserServiceImpl implements SampleUserService {

	@Autowired
	SampleUserRepositoryImpl repo;

	@Override
	public User getUserById(Long id) {
		return repo.getWhereIdIs(id);
	}

	public User findByLnameAndFname(String lname, String fname) {
		return repo.findByLnameAndFname(lname, fname);
	}

}
