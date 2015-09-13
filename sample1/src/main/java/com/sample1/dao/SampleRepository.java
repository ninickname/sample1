package com.sample1.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SampleRepository<T , ID extends Serializable> extends JpaRepository<T, ID> {
	 public T getWhereIdIs(ID id ); 
}
