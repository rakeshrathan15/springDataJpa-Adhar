package com.neoteric.springbootjpa_adhar.service;

import com.neoteric.springbootjpa_adhar.entity.AddressEntity;
import com.neoteric.springbootjpa_adhar.entity.NomineeEntity;
import com.neoteric.springbootjpa_adhar.entity.UserEntity;
import com.neoteric.springbootjpa_adhar.model.Address;
import com.neoteric.springbootjpa_adhar.model.User;
import com.neoteric.springbootjpa_adhar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
     public UserRepository userRepository;


    public UserEntity saveUser(User user){


        AddressEntity userAddress = mapToAddressEntity(user.getAddress());
        AddressEntity nomineeAddress= mapToAddressEntity(user.getNominee().getAddress());

        NomineeEntity nomineeEntity= new NomineeEntity();
        nomineeEntity.setNomineeName(user.getNominee().getNomineeName());
        nomineeEntity.setNomineeRelation(user.getNominee().getRelation());
        nomineeEntity.setAddressEntity(nomineeAddress);


        UserEntity userEntity= new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        userEntity.setAddressEntity(userAddress);
        userEntity.setNomineeEntity(nomineeEntity);

        return userEntity;
    }

    public AddressEntity mapToAddressEntity(Address address){
        AddressEntity addressEntity= new AddressEntity();
        addressEntity.setStreet(address.getStreet());
        addressEntity.setCity(address.getCity());
        addressEntity.setState(address.getState());
        addressEntity.setPincode(address.getPincode());
        return addressEntity;
    }

    public void someMethod(User user) {
        // Access the address of the user
        Address address = user.getAddress(); // This requires User to have getAddress()
        System.out.println("User Address: " + address.getStreet());
    }




}
