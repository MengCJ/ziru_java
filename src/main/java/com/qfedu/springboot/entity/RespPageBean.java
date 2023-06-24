package com.qfedu.springboot.entity;

import java.util.List;

public class RespPageBean {
    private Integer total;
    private List<?> data;


    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


}
