package com.bank.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts , Integer>{

	List<Accounts> findByCifNumber(Integer cifNumber);

}
