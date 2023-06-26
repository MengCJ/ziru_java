package com.qfedu.springboot.mapper;

import com.qfedu.springboot.entity.Room;
import org.apache.ibatis.annotations.Param;

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

    List<Room> getRoomPage(
            @Param("offset") int offset,
            @Param("size") Integer size,
            @Param("rid") String rid,
            @Param("roomType") String roomType,
            @Param("minRentFee") Integer minRentFee,
            @Param("maxRentFee") Integer maxRentFee);

    Room getRoomById(Integer roomId);

    int deleteRoom(Integer roomId);

    int updataRoom(Room room);

    int Online(Integer roomId);

    int Offline(Integer roomId);
}




