package com.qfedu.springboot.controller;


import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.entity.User;
import com.qfedu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public RespPageBean getUserPages(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String name){
        return userService.getUserByPage(page,size,name);
    }

    @GetMapping("/{id}")
    public RespBean getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping
    public RespBean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public RespBean deleteUserById(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }

    @PutMapping
    public RespBean updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PutMapping("/{id}")
    public RespBean deBlockedUser(@PathVariable Integer id) {
        return userService.deBlockedUser(id);
    }
}
