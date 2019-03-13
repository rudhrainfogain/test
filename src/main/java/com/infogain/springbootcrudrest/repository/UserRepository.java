package com.infogain.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogain.springbootcrudrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
