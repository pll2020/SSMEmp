package com.whxh.mapper;

import com.whxh.entity.Emp;
import com.whxh.util.Params;

import java.util.List;

public interface EmpMapper {
    //查询一条
    public Emp SelOne(int id);
    //查询所有
    public List<Emp> SelEmpAll(Params params);
    //添加信息
    public int InsertOne(Emp emp);
    //修改信息
    public int UpdateOne(Emp emp);
    //删除信息
    public int DeleteOne(int id);
}
