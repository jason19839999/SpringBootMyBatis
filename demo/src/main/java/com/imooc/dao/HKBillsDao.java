package com.imooc.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface HKBillsDao {

    @Select("SELECT  show_name FROM app_channel ORDER BY channel ")
    public List<String> listShowNames();

}
