package com.qfedu.springboot.controller;


import com.alibaba.excel.EasyExcel;
import com.qfedu.springboot.entity.Residence;
import com.qfedu.springboot.entity.RespBean;
import com.qfedu.springboot.entity.RespPageBean;
import com.qfedu.springboot.excel.ResidenceReadListener;
import com.qfedu.springboot.service.ResidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/residence")
public class ResidenceController {

    @Autowired
    ResidenceService residenceService;

    @PostMapping
    public RespBean addResidence(@RequestBody Residence residence){
        return residenceService.addResidence(residence);
    }

    @GetMapping
    public RespPageBean getResidencePage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size,String name,
                                         String province,String city,String area){
        return residenceService.getResidencePage(page,size,name,province,city,area);
    }

    @GetMapping("/{rid}")
    public RespBean addResidenceById(@PathVariable Integer rid){
        return residenceService.addResidenceById(rid);
    }

    @PutMapping
    public RespBean putResidence(@RequestBody Residence residence){
        return residenceService.putResidence(residence);
    }

    @DeleteMapping("/{rid}")
    public RespBean deleteResidence(@PathVariable Integer rid){

        return residenceService.deleteResidence(rid);

    }

    //导出excel表格

    @GetMapping("/export")
    public void exportData(HttpServletResponse resp) throws IOException{
        List<Residence> list = (List<Residence>) residenceService.getResidencePage(1,Integer.MAX_VALUE,null,null,null,null).getData();

        resp.setHeader( "content-disposition","attachement;filename=" + new String("小区数据.xlsx".getBytes("UTF-8"),"ISO-8859-1"));
        EasyExcel.write(resp.getOutputStream(),Residence.class).sheet("小区数据").doWrite(list);
    }

    //写入表格
    @PostMapping("/import")
    public RespBean importData(MultipartFile file){
        try {
            EasyExcel.read(file.getInputStream(),Residence.class,new ResidenceReadListener(residenceService)).sheet().doRead();
            return RespBean.ok("导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            return RespBean.error("导入失败");
        }
    }

}
