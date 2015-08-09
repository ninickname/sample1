package com.sample1.dao.imp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sample1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User , Integer>{

	//public List<User> findUsersWithIdBiggerThan(int id);

}
