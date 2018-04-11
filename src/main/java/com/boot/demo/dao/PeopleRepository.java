package com.boot.demo.dao;

import com.boot.demo.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Keyness on 2018/4/10.
 */
public interface PeopleRepository extends JpaRepository<People, Long> {

    People findByUserName(String userName);
    People findByUserNameOrEmail(String userName, String email);
}
