package com.study.myProject.petBill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.myProject.entity.Users;
import com.study.myProject.petBill.entity.PetBillUsers;

@Repository
public interface UserRepository extends JpaRepository<Users, String>{

	Users findByIdAndPassword(String id, String password);
}
