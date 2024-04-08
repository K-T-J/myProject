package com.study.myProject.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.myProject.main.entity.UserInfo;
import com.study.myProject.petBill.entity.PetBillUsers;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String>{

	UserInfo findByIdAndPw(String id, String password);
}
