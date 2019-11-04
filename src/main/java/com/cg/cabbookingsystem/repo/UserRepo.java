package com.cg.cabbookingsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cabbookingsystem.dto.User2;

@Repository
public interface UserRepo extends JpaRepository<User2, Integer> {

}
