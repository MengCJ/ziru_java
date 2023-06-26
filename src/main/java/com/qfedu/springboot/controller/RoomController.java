package com.qfedu.springboot.controller;

import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.entity.Room;
import com.qfedu.springboot.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    //添加房源的接口
    @PostMapping
    public RespBean addRoom(@RequestBody Room room){
         return roomService.addRoom(room);
    }
    //分页查询的接口
    @GetMapping("/list")
    public RespPageBean getRoomPage(@RequestParam(defaultValue = "1") Integer page,
                                    @RequestParam(defaultValue = "10") Integer size,
                                     String rid,
                                     String roomType,
                                     Integer minRentFee,
                                    Integer maxRentFee
                                    ){
        return roomService.getRoomPage(page,size,rid,roomType,minRentFee,maxRentFee);
    }
    //删除的接口
    @DeleteMapping("/{roomId}")
    public RespBean deleteRoom(@PathVariable Integer roomId){
        return roomService.deleteRoom(roomId);
    }

    @GetMapping("/{roomId}")
    public RespBean getRoomById(@PathVariable Integer roomId){
        return roomService.getRoomById(roomId);
    }

    @PutMapping
    public RespBean updataRoom(@RequestBody Room room){
        return roomService.updataRoom(room);
    }

    //上线接口
    @PutMapping("/online/{roomId}")
    public RespBean Online(@PathVariable Integer roomId){
        return roomService.Online(roomId);
    }
    //下线接口

    @PutMapping("/Offline/{roomId}")
    public RespBean Offline(@PathVariable Integer roomId){
        return  roomService.Offline(roomId);
    }




}
