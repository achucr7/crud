package com.achu.basic.handler;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.achu.basic.structure.SalesRep;
import com.achu.basic.dao.RepDao;

@Component
public class RepHandlerImpl implements RepHandler{


    @Resource
    RepDao repDao;

    @Override
    public List<SalesRep> findAll() {
        return repDao.findAll();
    }

    @Override
    public List<SalesRep> findAllPaginated(Long start, Long size) {
        return repDao.findAllPaginated(start,size);
    };

    @Override
    public void addRep(SalesRep salesRep) {
        repDao.addRep(salesRep);
    }

    @Override
    public void updateRep(SalesRep salesRep) {
        repDao.updateRep(salesRep);
    }

    @Override
    public void executeUpdateRep(SalesRep salesRep){
        repDao.executeUpdateRep(salesRep);
    }

    @Override
    public void deleteRep(SalesRep salesRep) {
        repDao.deleteRep(salesRep);
    }
}
