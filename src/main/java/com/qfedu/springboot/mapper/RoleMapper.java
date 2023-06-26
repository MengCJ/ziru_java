package com.qfedu.springboot.mapper;

import com.qfedu.springboot.entity.Role;
import com.qfedu.springboot.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    List<Role> getRoleList();

    List<Role> getAllRoleList();

    int updateRole(Role role);

    Role getRoleByRoleNameZh(String nameZh);

    int addUser(Role role);

    Role getRoleById(Integer id);

    int deleteRoleById(Integer id);

    Integer getRoleListByNameZh(String nameZh);

    List<Role> getRoleByPage(@Param("offset") int offset,
                             @Param("size") Integer size,
                             @Param("nameZh") String nameZh);
}
