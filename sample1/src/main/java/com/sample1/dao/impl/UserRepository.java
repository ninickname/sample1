package com.sample1.dao.impl;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sample1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User ,Long >{


}
