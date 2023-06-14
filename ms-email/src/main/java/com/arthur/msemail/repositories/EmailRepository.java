package com.arthur.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arthur.msemail.entities.Email;
@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

	
	
}
