package com.qfedu.springboot.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.qfedu.springboot.config.Contants;
import com.qfedu.springboot.entity.Residence;
import com.qfedu.springboot.service.ResidenceService;

import java.util.ArrayList;
import java.util.List;

public class ResidenceReadListener implements ReadListener<Residence> {

    private List<Residence>  lists = new ArrayList<>();
    private ResidenceService residenceService;

    public ResidenceReadListener(ResidenceService residenceService) {
        this.residenceService = residenceService;
    }


    @Override
    public void invoke(Residence residence, AnalysisContext analysisContext) {
        residence.setDeleteFlag(Contants.UN_DELETE_FLAG);
        lists.add(residence);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        residenceService.addResidences(lists);
    }
}
