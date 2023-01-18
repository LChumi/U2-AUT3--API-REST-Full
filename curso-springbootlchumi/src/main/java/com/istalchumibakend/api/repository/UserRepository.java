package com.istalchumibakend.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.istalchumibakend.api.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {

	Page<User> findAll(Pageable pageable);
}
