package com.achu.basic.dao;

import java.util.List;

import com.achu.basic.structure.SalesRep;

public interface RepDao {

    List<SalesRep> findAll();
    List<SalesRep> findAllPaginated(Long start , Long size);

    void addRep(SalesRep rep);
    void updateRep(SalesRep rep);
    void executeUpdateRep(SalesRep rep);
    public void deleteRep(SalesRep rep);


}


