package com.theaudiochef.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theaudiochef.web.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
