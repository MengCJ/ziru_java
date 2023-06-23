package com.qfedu.springboot.mapper;


import com.qfedu.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    User loadUserByUsername(String username);


}
