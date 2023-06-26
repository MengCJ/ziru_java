package com.qfedu.springboot.controller;


import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.entity.Role;
import com.qfedu.springboot.entity.User;
import com.qfedu.springboot.service.RoleService;
import com.qfedu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping
    public RespBean getRoleList() {
        return roleService.getRoleList();
    }

    @GetMapping("/all")
    public RespBean getAllRoleList() {
        return roleService.getAllRoleList();
    }

    @GetMapping("/page")
    public RespPageBean getRolePages(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String nameZh){
        return roleService.getRoleByPage(page,size,nameZh);
    }

    @PutMapping
    public RespBean updateRole(@RequestBody Role role){
        return roleService.updateRole(role);
    }

    @PostMapping
    public RespBean addRole(@RequestBody Role role) {
        return roleService.addUser(role);
    }

    @DeleteMapping("/{id}")
    public RespBean deleteRoleById(@PathVariable Integer id) {
        return roleService.deleteRoleById(id);
    }


}
