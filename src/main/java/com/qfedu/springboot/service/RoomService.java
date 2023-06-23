package com.qfedu.springboot.service;

import com.qfedu.springboot.config.Contants;
import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.entity.Room;
import com.qfedu.springboot.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RoomService {

    @Autowired
    RoomMapper roomMapper;

    public RespBean addRoom(Room room){
        room.setCreateTime(new Date());
        room.setDeleteFlag(Contants.UN_DELETE_FLAG);
         int result = roomMapper.addRoom(room);
        return  result==1?RespBean.ok("添加成功"):RespBean.error("添加失败");
    }

    public RespPageBean getRoomPage(Integer page, Integer size) {
        final RespPageBean respPageBean = new RespPageBean();
        respPageBean.setTotal(roomMapper.getTotal());
        respPageBean.setData(roomMapper.getRoomPage((page-1)*size,size));
        return respPageBean;
    }

    public RespBean deleteRoom(Integer roomId) {
        Room i = roomMapper.getRoomById(roomId);
        if(i==null){
            return RespBean.error("房间不存在");
        }

        int result = roomMapper.deleteRoom(roomId);

        return result==1?RespBean.ok("删除成功"):RespBean.error("删除失败");

    }

    public RespBean getRoomById(Integer roomId) {
        return RespBean.ok("查询成功",roomMapper.getRoomById(roomId));
    }

    public RespBean updataRoom(Room room) {

        room.setUpdateTime(new Date());
        int i = roomMapper.updataRoom(room);
        return i==1?RespBean.ok("更新成功"):RespBean.error("添加失败");
    }


//    public RespBean updataRoom(Integer roomId) {
//
//        return null;
//    }
}
