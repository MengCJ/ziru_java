package com.qfedu.springboot.service;

import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.entity.User;
import com.qfedu.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.qfedu.springboot.config.Contants;

@Service
public class UserService implements UserDetailsService {
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
    public RespPageBean getUserByPage(Integer page, Integer size, String name) {
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setTotal(userMapper.getTotal(name));
        respPageBean.setData(userMapper.getUserByPage((page-1)*size,size,name));
        return respPageBean;
    }

    public RespBean addUser(User user) {
        String username = user.getUsername();
        User userByUserName = userMapper.getUserByUserName(username);
        System.out.println(userByUserName);
        if (userByUserName == null) {
            user.setEnabled(Contants.ENABLED);
            int result = userMapper.addUser(user);
            return result == 1 ? RespBean.ok("添加成功") : RespBean.error("添加失败");
        } else {
            return RespBean.error("用户已存在，添加失败");
        }
    }

    public RespBean deleteUserById(Integer id) {
        User u = userMapper.getUserById(id);
        if (u == null) {
            //说明这个小区已经被删除了
            return RespBean.error("用户不存在，删除失败");
        }
        int result = userMapper.deleteUserById(id);
        return result == 1 ? RespBean.ok("删除成功") : RespBean.error("删除失败");
    }

    public RespBean updateUser(User user) {
        int result = userMapper.updateUser(user);
        return result==1?RespBean.ok("更新成功"):RespBean.error("更新失败");
    }

    public RespBean getUserById(Integer id) {
        User userById = userMapper.getUserById(id);
        if(userById == null) {
            return RespBean.error("用户不存在");
        }
        return RespBean.ok("查询成功",userById);
    }
}


