package com.connect.professional.user.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.connect.professional.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository  {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public User save(User newUser) {
       dynamoDBMapper.save(newUser);
       return newUser;
    }
}
