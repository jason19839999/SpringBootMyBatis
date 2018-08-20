package com.imooc.service;

import com.imooc.dao.HKBillsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HKBillsService {

     @Autowired
    private HKBillsDao hKBillsDao;

    public List<String> listShowNames(){
      return  hKBillsDao.listShowNames();
    }


}
