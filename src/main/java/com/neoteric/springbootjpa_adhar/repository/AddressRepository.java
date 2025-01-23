package com.neoteric.springbootjpa_adhar.repository;

import com.neoteric.springbootjpa_adhar.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Integer> {



}
