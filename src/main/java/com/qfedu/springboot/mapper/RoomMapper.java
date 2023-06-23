package com.qfedu.springboot.mapper;

import com.qfedu.springboot.entity.Room;

import java.util.List;

/**
* @author lenoco
* @description 针对表【room(房间表)】的数据库操作Mapper
* @createDate 2023-06-20 15:22:26
* @Entity com.qfedu.springboot.entity.Room
*/
public interface RoomMapper {
   int addRoom(Room room);

    Integer getTotal();

    List<Room> getRoomPage(int offset, Integer size);

    Room getRoomById(Integer roomId);

    int deleteRoom(Integer roomId);

    int updataRoom(Room room);
}




