package com.example.demo.service.impl;

import com.example.demo.repository.mapper.TbUserMapper;
import com.example.demo.repository.model.TbUser;
import com.example.demo.repository.model.TbUserExample;
import com.example.demo.service.TbUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService{

    final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TbUserMapper tbUserMapper;

    @Override
    public String fortest(){
        try{
            int a = 1;
            int b = 0;
            int c = a / b;
            String tmp = String.valueOf(c);
            return tmp;
        }catch (Exception e) {
            log.error(e.getMessage());
            throw e;
        }
    }

    @Override
    public List<TbUser> getAllUser() {
        log.info("test-info-log");
        List<TbUser> userList = tbUserMapper.selectByExample(new TbUserExample());
        return userList;
    }
}
