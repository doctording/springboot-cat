package com.example.demo.service;

import com.example.demo.repository.model.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TbUserTest {

    final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void testGetAllUsers(){
        List<TbUser> userList = tbUserService.getAllUser();
        System.out.println("==============");
        userList.forEach(tbUser -> {
            System.out.println(tbUser);
        });
        System.out.println("==============");
    }

    @Test
    public void testFortest(){
        System.out.println("==============");
        System.out.println(tbUserService.fortest());
        System.out.println("==============");
    }
}
