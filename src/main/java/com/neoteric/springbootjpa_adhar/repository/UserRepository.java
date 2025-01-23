package com.neoteric.springbootjpa_adhar.repository;

import com.neoteric.springbootjpa_adhar.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository <UserEntity,Long>{



}
