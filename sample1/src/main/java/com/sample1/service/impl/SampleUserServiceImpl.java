package com.sample1.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sample1.dao.impl.SampleUserRepositoryImpl;
import com.sample1.model.User;
import com.sample1.service.SampleUserService;

@Service
@Transactional
public class SampleUserServiceImpl implements SampleUserService {

	private static final int PAGE_SIZE = 10;
	@Autowired
	SampleUserRepositoryImpl repo;

	@Override
	public User getUserById(Long id) {
		return repo.getWhereIdIs(id);
	}

	public User findByLnameAndFname(String lname, String fname) {
		return repo.findByLnameAndFname(lname, fname);
	}

	@Override
	public Page<User> getUserPage(Integer pageNumber) {

		PageRequest request = new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.DESC, "id");

		return repo.findAll(request);

	}

	@Override
	public Page<User> getUserPage2(Integer pageNumber) {

		PageRequest request = new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.ASC, "id");

		return repo.findUsersById(request);

	}

	@Override
	public User getUserWhosPhoneNumber(Long num) {
		return repo.getUserWhosPhoneNumber(num);
	}
}
