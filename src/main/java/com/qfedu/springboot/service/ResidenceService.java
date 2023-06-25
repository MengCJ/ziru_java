package com.qfedu.springboot.service;


import com.qfedu.springboot.config.Contants;
import com.qfedu.springboot.entity.Residence;
import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.mapper.ResidenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ResidenceService {

    @Resource
    ResidenceMapper residenceMapper;

    public RespBean addResidence(Residence residence){
        residence.setCreateTime(new Date());
        residence.setDeleteFlag(Contants.UN_DELETE_FLAG);
        int residence1 = residenceMapper.addResidence(residence);
        return residence1==1?RespBean.ok("添加成功"):RespBean.error("添加失败");
    }

//    查看小区

    public RespPageBean getResidencePage(Integer page, Integer size, String name, String province, String city, String area) {
        final RespPageBean respPageBean = new RespPageBean();
        respPageBean.setTotal(residenceMapper.getTotal(name,province,city,area));
        respPageBean.setData(residenceMapper.getResidencePage((page-1)*size,size,name,province,city,area));
        return respPageBean;
    }

    public RespBean deleteResidence(Integer rid) {

        Residence r =  residenceMapper.getResidenceById(rid);
        if(r==null){
            return RespBean.error("小区不存在，删除失败");
        }

        int result = residenceMapper.deleteResidence(rid);

        return result==1?RespBean.ok("删除成功"):RespBean.error("删除失败");

    }

    public RespBean addResidenceById(Integer rid) {
        return RespBean.ok("查询成功",residenceMapper.getResidenceById(rid));
    }

    public RespBean putResidence(Residence residence) {
        residence.setUpdateTime(new Date());
        int result = residenceMapper.putResidence(residence);
        return result==1?RespBean.ok("更新成功"):RespBean.error("添加失败");

    }

    public void addResidences(List<Residence> lists) {
        residenceMapper.addResidences(lists);
    }
}
