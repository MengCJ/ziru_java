package com.qfedu.springboot.service;

import com.qfedu.springboot.entity.User;
import com.qfedu.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Userservice implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userMapper.loadUserByUsername(username);
        if(u==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return u;
    }
}


