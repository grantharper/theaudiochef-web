package com.theaudiochef.web.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theaudiochef.web.domain.AmazonLogin;

@Repository
@Transactional
public interface AmazonLoginRepository extends JpaRepository<AmazonLogin, Long>{

    
}
