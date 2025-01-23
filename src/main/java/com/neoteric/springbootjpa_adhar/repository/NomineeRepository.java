package com.neoteric.springbootjpa_adhar.repository;

import com.neoteric.springbootjpa_adhar.entity.NomineeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface NomineeRepository extends JpaRepository<NomineeEntity,Integer> {



}
