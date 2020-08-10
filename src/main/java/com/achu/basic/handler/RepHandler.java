package com.achu.basic.handler;

import com.achu.basic.structure.SalesRep;

import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.achu.basic.structure.SalesRep;

public interface RepHandler {


    List<SalesRep> findAll();

    List<SalesRep> findAllPaginated(Long start , Long size);

    void addRep(SalesRep rep);

    void updateRep(SalesRep rep);

    void executeUpdateRep(SalesRep rep);

    void deleteRep(SalesRep rep);

}







