package com.achu.basic.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achu.basic.structure.SalesRep;
import com.achu.basic.handler.RepHandler;


@RestController
@RequestMapping("/rep")
public class RepController {

        @Resource
        RepHandler repHandler;

        @GetMapping(value = "/replist")
        public List<SalesRep> getReps(){
                
                return repHandler.findAll();
        }

        @GetMapping(value = "/rep")
        public List<SalesRep> getRepsPage(@QueryParam("start") Long start,@QueryParam("size") Long size){

                if(start>0 & size>0){
                        return repHandler.findAllPaginated(start,size);
                }

                return null;
        }

        @PostMapping(value = "/addrep")
        public void addRep(@RequestBody SalesRep salesRep) {
                repHandler.addRep(salesRep);
        }

        @PutMapping(value = "/updaterep")
        public void updateRep(@RequestBody SalesRep salesRep){
                repHandler.updateRep(salesRep);
        }

        @PutMapping(value = "/executeupdaterep")
        public void executeUpdateRep(@RequestBody SalesRep salesRep) { repHandler.executeUpdateRep(salesRep); }

        @DeleteMapping(value = "/deleterepbyid")
        public void deleteRep(@RequestBody SalesRep salesRep){
                repHandler.deleteRep(salesRep);
        }

}


















