package com.study.myProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.myProject.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String>{

}
