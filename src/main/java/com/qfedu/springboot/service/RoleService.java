package com.qfedu.springboot.service;

import com.qfedu.springboot.config.Contants;
import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.entity.Role;
import com.qfedu.springboot.entity.User;
import com.qfedu.springboot.mapper.RoleMapper;
import com.qfedu.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;
    public RespBean getRoleList() {
        List<Role> result =  roleMapper.getRoleList();
        return RespBean.ok("查询成功",result);
    }

    public RespBean getAllRoleList() {
        List<Role> result = roleMapper.getAllRoleList();
        return RespBean.ok("查询成功",result);
    }

    public RespBean updateRole(Role role) {
        int result = roleMapper.updateRole(role);
        return result==1?RespBean.ok("更新成功"):RespBean.error("更新失败");
    }

    public RespBean addUser(Role role) {
        String nameZh = role.getNameZh();
        Role roleByRoleNameZh = roleMapper.getRoleByRoleNameZh(nameZh);
        if (roleByRoleNameZh == null) {
            role.setEnabled(Contants.ROLE_ENABLED);
            int result = roleMapper.addUser(role);
            return result == 1 ? RespBean.ok("添加成功") : RespBean.error("添加失败");
        } else {
            return RespBean.error("岗位已存在，添加失败");
        }
    }

    public RespBean deleteRoleById(Integer id) {
        Role role = roleMapper.getRoleById(id);
        if (role == null) {
            //说明这个小区已经被删除了
            return RespBean.error("用户不存在，删除失败");
        }
        int result = roleMapper.deleteRoleById(id);
        return result == 1 ? RespBean.ok("删除成功") : RespBean.error("删除失败");
    }

    public RespPageBean getRoleByPage(Integer page, Integer size, String nameZh) {
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setTotal(roleMapper.getRoleListByNameZh(nameZh));
        respPageBean.setData(roleMapper.getRoleByPage((page-1)*size,size,nameZh));
        return respPageBean;
    }
}
