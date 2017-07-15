package com.theaudiochef.web.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theaudiochef.web.domain.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>{

}
