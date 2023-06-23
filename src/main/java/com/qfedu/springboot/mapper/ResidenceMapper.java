package com.qfedu.springboot.mapper;

import com.qfedu.springboot.entity.Residence;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author lenoco
* @description 针对表【residence(小区)】的数据库操作Mapper
* @createDate 2023-06-20 15:22:25
* @Entity com.qfedu.springboot.entity.Residence
*/
public interface ResidenceMapper {
    int addResidence(Residence residence);

    Integer getTotal(@Param("name") String name, @Param("province") String province, @Param("city") String city, @Param("area") String area);

    List<Residence> getResidencePage(@Param("offset") int offset, @Param("size") Integer size, @Param("name") String name, @Param("province") String province, @Param("city") String city, @Param("area") String area);

    Residence getResidenceById(Integer rid);

    Integer deleteResidence(Integer rid);

    int putResidence(Residence residence);

    void addResidences(@Param("residences") List<Residence> lists);
}




