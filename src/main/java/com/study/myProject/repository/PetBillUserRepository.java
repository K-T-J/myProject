package com.study.myProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.myProject.entity.Users;
import com.study.myProject.petBill.entity.PetBillUsers;

@Repository
public interface PetBillUserRepository extends JpaRepository<PetBillUsers, String>{

	Optional<PetBillUsers> findByNickName(String nickName);

}
