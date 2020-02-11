package com.whxh.service;

import com.whxh.entity.Emp;
import com.whxh.util.Params;

import java.util.List;

public interface EmpService {
    //查询一条
    public Emp SelOne(int id);
    //查询所有
    public List<Emp> SelEmpAll(Params params);
    //修改信息
    public int UpdateOne(Emp emp);
    //添加信息
    public int InsertOne(Emp emp);
    //删除信息
    public int DeleteOne(int id);
}
